package com.yb.cloud.domain.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Lixiangping
 * @createTime 2022年03月29日 16:13
 * @decription: 订单DTO
 */
@Data
public class OrderDTO implements Serializable {

    private Long serviceCategoryId;
    private Long serviceInfoId;
    private String serviceName;

    private Long patientId;
    private String patientName;
    private String patientContact;
    private Long userId;

    private Long hospitalId;
    private String hospitalName;
    private Long officeId;
    private String officeName;

//    private Integer serviceDayCode;//服务天编码：1-今天 2-明天
//    private Date serviceTime;//服务时间
//
//    private Integer serviceCycleDayCode;//服务周期天编码：1-今天 2-明天
//    private Integer serviceCycleHourRangeCode;//1-上午（8-12点） 2-（下午13.30-17.00） 3-全天（8-17）

    private String remark;

    private Integer payMethod;//支付方式

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date serviceDay;//服务日期
    private Integer periodType;//时间段：Morning-上午  afternoon-下午 full_day-全天
    private String periodStr;

    private BigDecimal price;//价格
    private Long userCouponId;//用户优惠券id
    private BigDecimal finalPrice;//使用优惠券后的价格

}
