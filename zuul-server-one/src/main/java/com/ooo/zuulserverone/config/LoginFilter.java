package com.ooo.zuulserverone.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 创建过滤器
 * @author LiuchangLan
 * @date 2020/4/23 15:42
 */
@Configuration
public class LoginFilter extends ZuulFilter {

    /**
     * @description 是否需要过滤
     * @author LiuChangLan
     * @since 2020/4/23 15:48
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * @description 路由方式 四个可选值
     * @author LiuChangLan
     * @since 2020/4/23 15:45
     */
    @Override
    public String filterType() {
        return "pre";
        //四个可选值 路由前:pre 路由时:routing 路由后:post 发送错误调用:error

    }

    /**
     * @description 过滤顺序 数字越小 原先执行
     * @author LiuChangLan
     * @since 2020/4/23 15:48
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * @description 过滤代码 这里token做演示
     * @author LiuChangLan
     * @since 2020/4/23 15:48
     */
    @Override
    public Object run() throws ZuulException {
        //获取请求上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //获取HttpServletRequest
        HttpServletRequest request = currentContext.getRequest();
        //获取参数
        String token = request.getParameter("token");
        if (token == null || "".equals(token)){
            //是否继续从网关发送请求到服务 false为不发送
            currentContext.setSendZuulResponse(false);
            //设置返回状态码
            currentContext.setResponseStatusCode(401);
            //获取HttpServletResponse
            HttpServletResponse response = currentContext.getResponse();
            response.setContentType("text/html; charset=UTF-8");
            try {
                PrintWriter writer = response.getWriter();
                writer.write("请先进行登录");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
