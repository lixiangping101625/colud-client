package com.yb.cloud.mapper;


import com.yb.cloud.domain.OrderPayRecord;

import java.util.List;

/**
 * 用户支付记录 Mapper接口
 * 
 * @author snailever
 * @date 2022-04-24
 */
public interface OrderPayRecordMapper 
{
    /**
     * 查询用户支付记录 
     * 
     * @param id 用户支付记录 主键
     * @return 用户支付记录 
     */
    public OrderPayRecord selectOrderPayRecordById(Long id);

    /**
     * 查询用户支付记录 列表
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 用户支付记录 集合
     */
    public List<OrderPayRecord> selectOrderPayRecordList(OrderPayRecord orderPayRecord);

    /**
     * 新增用户支付记录 
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 结果
     */
    public int insertOrderPayRecord(OrderPayRecord orderPayRecord);

    /**
     * 修改用户支付记录 
     * 
     * @param orderPayRecord 用户支付记录 
     * @return 结果
     */
    public int updateOrderPayRecord(OrderPayRecord orderPayRecord);

    /**
     * 删除用户支付记录 
     * 
     * @param id 用户支付记录 主键
     * @return 结果
     */
    public int deleteOrderPayRecordById(Long id);

    /**
     * 批量删除用户支付记录 
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderPayRecordByIds(Long[] ids);
}
