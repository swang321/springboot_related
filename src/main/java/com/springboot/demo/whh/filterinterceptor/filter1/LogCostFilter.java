package com.springboot.demo.whh.filterinterceptor.filter1;


import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * @Author whh
 */
public class LogCostFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("LogCostFilter execute cost: " + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}
