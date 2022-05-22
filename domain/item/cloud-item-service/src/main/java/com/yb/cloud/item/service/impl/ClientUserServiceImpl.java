package com.yb.cloud.item.service.impl;

import com.yb.cloud.annotation.Log;
import com.yb.cloud.api.IClientUserService;
import com.yb.cloud.item.mapper.ClientUserMapper;
import com.yb.cloud.item.pojo.ClientUser;
import com.yb.cloud.pojo.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 客户端用户 Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
@RestController//Eureka是基于Http的服务治理框架
@Slf4j
public class ClientUserServiceImpl implements IClientUserService
{

    @Resource
    private ClientUserMapper clientUserMapper;

    @Override
    @Log(title = "查询所有用户")
    public AjaxResult queryAll() {
        List<ClientUser> clientUsers = clientUserMapper.queryAll();
        return AjaxResult.success(clientUsers);
    }

    @Override
    public AjaxResult mobileExist(String mobile)
    {
        ClientUser clientUser = new ClientUser();
        clientUser.setMobile(mobile);
        List<ClientUser> clientUsers = clientUserMapper.selectClientUserList(clientUser);

        HashMap<String, Object> map = new HashMap<>();
        if (clientUsers.size()>0) {
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
