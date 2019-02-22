package com.springboot.demo.whh.filterinterceptor.filter1;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author whh
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean regBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogCostFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("LogCostFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
