package com.ooo.eurekaservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description eureka服务一
 * @author LiuChangLan
 * @since 2020/4/21 10:09
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTwoApplication.class, args);
    }

}
