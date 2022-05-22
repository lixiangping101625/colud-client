package com.yb.cloud.item.mapper;


import com.yb.cloud.item.pojo.ClientUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 客户端用户 Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
@Mapper
public interface ClientUserMapper
{
    List<ClientUser> queryAll();

    /**
     * 查询客户端用户
     *
     * @param id 客户端用户 主键
     * @return 客户端用户
     */
    public ClientUser selectClientUserById(Long id);

    /**
     * 查询客户端用户 列表
     *
     * @param clientUser 客户端用户
     * @return 客户端用户 集合
     */
    public List<ClientUser> selectClientUserList(ClientUser clientUser);

    /**
     * 新增客户端用户
     *
     * @param clientUser 客户端用户
     * @return 结果
     */
    public int insertClientUser(ClientUser clientUser);

    /**
     * 修改客户端用户
     *
     * @param clientUser 客户端用户
     * @return 结果
     */
    public int updateClientUser(ClientUser clientUser);

    /**
     * 删除客户端用户
     *
     * @param id 客户端用户 主键
     * @return 结果
     */
    public int deleteClientUserById(Long id);

    /**
     * 批量删除客户端用户
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClientUserByIds(Long[] ids);

}