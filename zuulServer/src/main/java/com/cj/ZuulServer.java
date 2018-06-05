package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * 没有服务发现和反向代理功能，没有route过滤器，只有pre,post,error过滤器
 * @author wb-cj189958
 * @date 2018/6/4 19:16
 */
@SpringBootApplication
@EnableZuulServer
public class ZuulServer {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class, args);
    }

}
