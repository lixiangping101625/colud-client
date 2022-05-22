package com.yb.cloud.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yb.cloud.pojo.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户支付记录 对象 order_pay_record
 * 
 * @author snailever
 * @date 2022-04-24
 */
@Data
public class OrderPayRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单号 */
    private String orderNo;

    /** 第三方平台订单号 */
    private String tradeNo;

    /** 支付方式：1-微信2-支付宝 */
    private String payMethod;

    /** 用户id */
    private Long userId;

    /** 交易金额（实际支付） */
    private BigDecimal totalAmount;

    /** 支付结果：0--成功1-失败 */
    private Integer tradeStatus;

    /** 支付回调确认：0-成功1-失败 */
    private String callbackTradeStatus;

    /** 创建人 */
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatedTime;

}
