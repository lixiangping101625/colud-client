
package com.yb.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.yb.cloud.domain.Orders;
import com.yb.cloud.domain.to.OrderDTO;
import com.yb.cloud.domain.vo.OrderVO;
import com.yb.cloud.pojo.AjaxResult;
import com.yb.cloud.service.IOrdersService;
import com.yb.cloud.utils.bean.DozerBeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户订单 Controller
 * 
 * @author ruoyi
 * @date 2022-03-16
 */
@RestController
@RequestMapping("/orders")
public class OrdersController extends BaseController
{
    @Resource
    private IOrdersService ordersService;

    @GetMapping("/list/{userId}/{orderStatus}")
    public AjaxResult list(@PathVariable("userId") Long userId,
                           @PathVariable("orderStatus") Integer orderStatus){
        startPage();
        Orders orders = new Orders();
        orders.setRefundStatus(orderStatus);
        orders.setUserId(userId);
        List<Orders> list = ordersService.selectOrdersList(orders);
        PageInfo pageInfo = pageInfo(list);
        ArrayList<OrderVO> orderVOS = new ArrayList<>();
        if (list.size() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            list.stream().forEach(orders1 -> {
                OrderVO orderVO = DozerBeanUtils.deepCopy(orders1, OrderVO.class);
                OrderDTO orderDTO = JSON.parseObject(orders1.getSnapData(), OrderDTO.class);
                orderVO.setOrderDTO(orderDTO);
                orderVO.setPlacedTimeStr(sdf.format(orderVO.getPlacedTime()));
                orderVO.setExpiredTimeStr(sdf.format(orderVO.getExpiredTime()));

                Integer periodType = orderDTO.getPeriodType();
                Long hospitalId = orderDTO.getHospitalId();

//                ServicePeriod qd = new ServicePeriod();
//                qd.setHosipitalId(hospitalId);
//                qd.setServicePeriodType(Long.valueOf(periodType));
//                List<ServicePeriod> servicePeriods = servicePeriodMapper.selectServicePeriodList(qd);
//                ServicePeriod servicePeriod = servicePeriods.get(0);
//
//                Date serviceDay = orderDTO.getServiceDay();
//                String sd = DateUtils.parseDateToStr("yyyy-MM-dd HH:mm:ss", serviceDay);
//                String periodStr = sd.split(" ")[0]
//                        +" "
//                        + servicePeriod.getBeginTime()
//                        + "-"
//                        +servicePeriod.getEndTime();
//                orderDTO.setPeriodStr(periodStr.toString());

                orderVOS.add(orderVO);
            });
        }
        pageInfo.setList(orderVOS);
        return AjaxResult.success(pageInfo);

    }

}
