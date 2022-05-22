package com.cloud.yb.item;

/**
 * @author Lixiangping
 * @createTime 2022年05月22日 17:45
 * @decription:
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.yb.cloud.item.mapper")
@SpringBootApplication
@EnableDiscoveryClient // 表示到注册中心拉取服务注册列表
@ComponentScan(basePackages = {"com.yb"})
// TODO: 2022/5/22 Feign组件
public class ItemApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ItemApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}