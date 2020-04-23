package com.ooo.consumerserverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
/** 开启熔断器*/
@EnableHystrix
/**开启熔断器监控*/
@EnableHystrixDashboard
public class ConsumerServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerRibbonApplication.class, args);
    }

}
