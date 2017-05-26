package com.example.spring.boot.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: 王俊超
 * Date: 2017-05-26 07:47
 * All Rights Reserved !!!
 */
public class AccessFilter extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");

        if (accessToken == null) {
            log.warn("access token is empty");
            // false：令zuul过滤该请求，不对其进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }

        log.info("access token ok");
        return null;
    }
}
