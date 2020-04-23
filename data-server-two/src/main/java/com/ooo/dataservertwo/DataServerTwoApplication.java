package com.ooo.dataservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ooo.dataservertwo.mapper")
public class DataServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataServerTwoApplication.class, args);
    }

}
