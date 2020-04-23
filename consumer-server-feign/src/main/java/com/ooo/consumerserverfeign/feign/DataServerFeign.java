package com.ooo.consumerserverfeign.feign;

import com.ooo.consumerserverfeign.feign.hystrix.DataServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author LiuchangLan
 * @date 2020/4/22 17:40
 */
@FeignClient(value = "data-server",fallback = DataServerHystrix.class)
public interface DataServerFeign {

    @GetMapping("/test/get")
    String get();


    @GetMapping("/student/selectAll")
    List selectAll();
}
