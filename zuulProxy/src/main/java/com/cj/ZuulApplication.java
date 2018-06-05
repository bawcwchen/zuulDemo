package com.cj;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wb-cj189958
 * @date 2018/6/3 20:44
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@RestController
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public IRule weightedResponseTimeRule() {
        return new WeightedResponseTimeRule();//这里配置策略，和配置文件对应
    }


    @RequestMapping("/hello")
    public String hello() {
        return "local hello";
    }

    @RequestMapping("/localForward/hello")
    public String localForward() {
        return "localForward hello";
    }

    @RequestMapping("/nostripPrefix/hello")
    public String nostripPrefix() {
        return "nostripPrefix hello";
    }

}
