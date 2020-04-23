package com.ooo.consumerserverfeign.feign.hystrix;

import com.ooo.consumerserverfeign.feign.DataServerFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * dataServer服务熔断器
 * @author LiuchangLan
 * @date 2020/4/22 18:00
 */
@Component
public class DataServerHystrix implements DataServerFeign {

    @Override
    public List selectAll() {
        List list = new ArrayList();
        list.add("服务器不可用");
        return list;
    }

    @Override
    public String get() {
        return "服务器不可用";
    }
}
