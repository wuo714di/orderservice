package com.yun.order.untils;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author WXD
 * @date 2019-08-22 15:58
 * @description: m枚举
 */
public class ColourDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(Color.RED.getName());
    }

    @Override
    public void destroy() {

    }
}
