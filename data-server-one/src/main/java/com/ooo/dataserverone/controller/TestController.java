package com.ooo.dataserverone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuchangLan
 * @date 2020/4/22 10:21
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${spring.application.name}")
    public String serverName;

    @Value("${server.port}")
    public String port;

    @GetMapping("/get")
    public String get(){
        return serverName + "端口:" + port;
    }
}
