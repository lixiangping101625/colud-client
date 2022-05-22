package com.yb.cloud.service.impl;

import com.yb.cloud.domain.Orders;
import com.yb.cloud.mapper.OrdersMapper;
import com.yb.cloud.service.IOrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户订单 Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-03-16
 */
@Service
@Slf4j
public class OrdersServiceImpl implements IOrdersService
{
    @Resource
    private OrdersMapper ordersMapper;

    /**
     * 查询用户订单 列表
     *
     * @param orders 用户订单
     * @return 用户订单
     */
    @Override
    public List<Orders> selectOrdersList(Orders orders)
    {
        /*注意redis键失效调用不到，所以不要在上下文中获取*/
//        orders.setUserId(SecurityUtils.getUserId());
        return ordersMapper.selectOrdersList(orders);
    }
}
