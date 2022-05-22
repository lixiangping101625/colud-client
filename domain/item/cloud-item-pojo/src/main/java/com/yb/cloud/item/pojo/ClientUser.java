package com.yb.cloud.item.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.yb.cloud.pojo.BaseEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 客户端用户 对象 client_user
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@ApiModel(value = "客户端用户")
public class ClientUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @JsonSerialize(using = ToStringSerializer.class)
    //@ApiModelProperty(value = "主键", notes = "主键", dataType = "Long")
    private Long id;

    /** 昵称 */
    //@ApiModelProperty(value = "昵称", notes = "昵称", dataType = "String")
    private String nickName;

    /** 手机号 */
    //@ApiModelProperty(value = "手机号", notes = "手机号", dataType = "String")
    private String mobile;

    /** 头像 */
    //@ApiModelProperty(value = "头像", notes = "头像", dataType = "String")
    private String avatar;

    /** 0-女 1-男 */
    //@ApiModelProperty(value = "主键", notes = "主键", dataType = "Long")
    private Integer gender;

    /** 真实姓名 */
    //@ApiModelProperty(value = "真实姓名", notes = "真实姓名", dataType = "String")
    private String realName;

    /** 身份证号 */
    //@ApiModelProperty(value = "身份证号", notes = "身份证号", dataType = "String")
    private String idCard;

    /** 年龄 */
    //@ApiModelProperty(value = "年龄", notes = "年龄", dataType = "Integer")
    private Integer age;

    /*地址相关*/
    //@ApiModelProperty(value = "省份", notes = "省份", dataType = "String")
    private String provStr;
    //@ApiModelProperty(value = "城市", notes = "城市", dataType = "String")
    private String cityStr;
    //@ApiModelProperty(value = "区域", notes = "区域", dataType = "String")
    private String regionStr;
    //@ApiModelProperty(value = "详细地址", notes = "详细地址", dataType = "String")
    private String addrDetail;

    /** 账号状态：1-删除 0-正常 */
    //@ApiModelProperty(value = "账号状态：1-删除 0-正常", notes = "账号状态：1-删除 0-正常", dataType = "Integer")
    private Integer delFlag;

    /** 创建人 */
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    /** 更新人 */
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

}
