package com.yb.cloud.service.impl;

import com.yb.cloud.domain.OrderPayRecord;
import com.yb.cloud.mapper.OrderPayRecordMapper;
import com.yb.cloud.service.IOrderPayRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户支付记录 Service业务层处理
 * 
 * @author snailever
 * @date 2022-04-24
 */
@Service
public class OrderPayRecordServiceImpl implements IOrderPayRecordService
{
    @Autowired
    private OrderPayRecordMapper orderPayRecordMapper;

    /**
     * 查询用户支付记录 
     * 
     * @param id 用户支付记录 主键
     * @return 用户支付记录 
     */
    @Override
    public OrderPayRecord selectOrderPayRecordById(Long id)
    {
        return orderPayRecordMapper.selectOrderPayRecordById(id);
    }

    /**
     * 查询用户支付记录 列表
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 用户支付记录 
     */
    @Override
    public List<OrderPayRecord> selectOrderPayRecordList(OrderPayRecord orderPayRecord)
    {
        return orderPayRecordMapper.selectOrderPayRecordList(orderPayRecord);
    }

    /**
     * 新增用户支付记录 
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 结果
     */
    @Override
    public int insertOrderPayRecord(OrderPayRecord orderPayRecord)
    {
        return orderPayRecordMapper.insertOrderPayRecord(orderPayRecord);
    }

    /**
     * 修改用户支付记录 
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 结果
     */
    @Override
    public int updateOrderPayRecord(OrderPayRecord orderPayRecord)
    {
        return orderPayRecordMapper.updateOrderPayRecord(orderPayRecord);
    }

    /**
     * 批量删除用户支付记录 
     * 
     * @param ids 需要删除的用户支付记录 主键
     * @return 结果
     */
    @Override
    public int deleteOrderPayRecordByIds(Long[] ids)
    {
        return orderPayRecordMapper.deleteOrderPayRecordByIds(ids);
    }

    /**
     * 删除用户支付记录 信息
     * 
     * @param id 用户支付记录 主键
     * @return 结果
     */
    @Override
    public int deleteOrderPayRecordById(Long id)
    {
        return orderPayRecordMapper.deleteOrderPayRecordById(id);
    }
}
