package com.ooo.consumerserverfeign.controller;

import com.ooo.consumerserverfeign.feign.DataServerFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuchangLan
 * @date 2020/4/22 17:26
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource
    private DataServerFeign dataServerFeign;

    @GetMapping("selectAll")
    public List selectAll(){
        return dataServerFeign.selectAll();
    }

}
