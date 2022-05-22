package com.yb.cloud.controller;

import com.yb.cloud.pojo.AjaxResult;
import com.yb.cloud.pojo.ClientUser;
import com.yb.cloud.service.IClientUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

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
    @Autowired
    private IClientUserService clientUserService;

    @ApiOperation(value = "查询所有用户", notes = "查询所有用户", httpMethod = "GET")
    @GetMapping("/all")
    public AjaxResult mobileExist(){
        List<ClientUser> list = clientUserService.queryAll();
        return AjaxResult.success(list);
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
        ClientUser queryDomain = new ClientUser();
        queryDomain.setMobile(mobile);
        List<ClientUser> list = clientUserService.selectClientUserList(queryDomain);
        HashMap<String, Object> map = new HashMap<>();
        if (list.size() > 0) {
            map.put("canUse", false);
            map.put("msg", "当前手机号已注册~");
        }
        else {
            map.put("canUse", true);
            map.put("msg", "当前手机号未注册~");
        }
        return AjaxResult.success(map);
    }

}
