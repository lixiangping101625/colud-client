package com.yb.cloud.service.impl;

import com.yb.cloud.mapper.ClientUserMapper;
import com.yb.cloud.pojo.ClientUser;
import com.yb.cloud.service.IClientUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户端用户 Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
@Service
public class ClientUserServiceImpl implements IClientUserService
{

    @Resource
    private ClientUserMapper clientUserMapper;

    @Override
    public List<ClientUser> queryAll() {
        return clientUserMapper.queryAll();
    }
    /**
     * 查询客户端用户 列表
     *
     * @param clientUser 客户端用户
     * @return 客户端用户
     */
    @Override
    public List<ClientUser> selectClientUserList(ClientUser clientUser)
    {
        return clientUserMapper.selectClientUserList(clientUser);
    }

}
