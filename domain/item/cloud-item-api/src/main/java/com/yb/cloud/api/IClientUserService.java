package com.yb.cloud.api;


import com.yb.cloud.item.pojo.ClientUser;
import com.yb.cloud.pojo.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 客户端用户 Service接口
 * 
 * @author ruoyi
 * @date 2022-04-09
 */
@RequestMapping("/client-user")
public interface IClientUserService
{
   /**
    * 查询所有
    * @return
    */
   @GetMapping("/all")
   AjaxResult queryAll();

   /**
    * 判断手机号是否已注册
    * @param mobile
    * @return
    */
   @GetMapping("/mobile-exist")
   public AjaxResult mobileExist(@RequestParam String mobile);
}
