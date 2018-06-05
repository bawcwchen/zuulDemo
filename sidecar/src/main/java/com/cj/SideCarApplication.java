package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wb-cj189958
 * @date 2018/6/5 8:58
 */
@SpringBootApplication
@EnableSidecar
public class SideCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SideCarApplication.class, args);
    }


}
