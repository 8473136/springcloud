package com.ooo.dataserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ooo.dataserverone.mapper")
public class DataServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataServerOneApplication.class, args);
    }

}
