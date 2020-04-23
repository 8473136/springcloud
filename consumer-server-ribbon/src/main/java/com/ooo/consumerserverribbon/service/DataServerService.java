package com.ooo.consumerserverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuchangLan
 * @date 2020/4/22 18:10
 */
@Service
public class DataServerService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "selectAllRequestError")
    public List selectAll(){
        return restTemplate.getForObject("http://data-server/student/selectAll",List.class);
    }

    @HystrixCommand(fallbackMethod = "getRequestError")
    public String get(){
        return restTemplate.getForObject("http://data-server/test/get",String.class);
    }

    /**
     * @description get熔断方法
     * @author LiuChangLan
     * @since 2020/4/23 9:17
     */
    public String getRequestError(){
        return "服务器不可用";
    }

    /**
     * @description selectAll熔断方法
     * @author LiuChangLan
     * @since 2020/4/23 9:17
     */
    public List selectAllRequestError() {
        List list = new ArrayList();
        list.add("服务器不可用");
        return list;
    }


}
