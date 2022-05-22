package com.yb.cloud.service;


import com.yb.cloud.pojo.ClientUser;

import java.util.List;

/**
 * 客户端用户 Service接口
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
public interface IClientUserService 
{
   List<ClientUser> queryAll();

   /**
    * 查询客户端用户 列表
    *
    * @param clientUser 客户端用户
    * @return 客户端用户 集合
    */
   public List<ClientUser> selectClientUserList(ClientUser clientUser);
}
