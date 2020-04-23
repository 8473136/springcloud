package com.ooo.consumerserverribbon.controller;

import com.netflix.discovery.converters.Auto;
import com.ooo.consumerserverribbon.service.DataServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LiuchangLan
 * @date 2020/4/22 17:36
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private DataServerService dataServerService;

    @GetMapping("get")
    public String get(){
       return dataServerService.get();
    }
}
