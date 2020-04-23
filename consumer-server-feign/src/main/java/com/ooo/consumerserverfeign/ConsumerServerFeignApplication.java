package com.ooo.consumerserverfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/**开启熔断器监控*/
@EnableHystrixDashboard
public class ConsumerServerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerFeignApplication.class, args);
    }

}
