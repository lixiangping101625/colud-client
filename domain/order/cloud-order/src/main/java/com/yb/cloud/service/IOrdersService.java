package com.yb.cloud.service;


import com.yb.cloud.domain.Orders;

import java.util.List;

/**
 * 用户订单 Service接口
 * 
 * @author ruoyi
 * @date 2022-03-16
 */
public interface IOrdersService 
{

    /**
     * 查询用户订单 列表
     *
     * @param orders 用户订单
     * @return 用户订单 集合
     */
    public List<Orders> selectOrdersList(Orders orders);
}
