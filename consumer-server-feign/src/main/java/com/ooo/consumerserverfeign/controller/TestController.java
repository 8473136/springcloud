package com.ooo.consumerserverfeign.controller;

import com.ooo.consumerserverfeign.feign.DataServerFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiuchangLan
 * @date 2020/4/22 17:26
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private DataServerFeign dataServerFeign;

    @GetMapping("get")
    public String get(){
        return dataServerFeign.get();
    }

}
