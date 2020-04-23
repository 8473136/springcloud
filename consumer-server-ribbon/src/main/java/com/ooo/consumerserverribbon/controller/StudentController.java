package com.ooo.consumerserverribbon.controller;

import com.ooo.consumerserverribbon.service.DataServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuchangLan
 * @date 2020/4/22 17:49
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource
    private DataServerService dataServerService;

    @GetMapping("selectAll")
    public List selectAll(){
        return dataServerService.selectAll();
    }
}
