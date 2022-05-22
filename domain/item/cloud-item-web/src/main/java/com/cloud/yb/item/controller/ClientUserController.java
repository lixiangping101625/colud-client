package com.cloud.yb.item.controller;

import com.yb.cloud.api.IClientUserService;
import com.yb.cloud.pojo.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户端用户 Controller
 *
 * @author ruoyi
 * @date 2022-04-09
 */
@RestController
@RequestMapping("/client-user")
@Api(value = "客户端用户接口")
public class ClientUserController
{
    @Resource
    private IClientUserService clientUserService;

    @ApiOperation(value = "查询所有用户", notes = "查询所有用户", httpMethod = "GET")
    @GetMapping("/all")
    public AjaxResult queryAll(){
        return clientUserService.queryAll();
    }

    /**
     * 判断手机号是否已注册
     * @param mobile
     * @return
     */
    @ApiOperation(value = "判断手机号是否已注册", notes = "判断手机号是否已注册", httpMethod = "GET")
    @GetMapping("/mobile-exist")
    public AjaxResult mobileExist(@RequestParam String mobile){
        if (StringUtils.isEmpty(mobile)) {
            return AjaxResult.error("手机号不能为空");
        }
        return clientUserService.mobileExist(mobile);
    }

}
