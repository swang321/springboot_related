package com.springboot.demo.whh.annotation.example2;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;


/**
 * @Author whh
 */
public class AuthorityInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Authority authority = method.getAnnotation(Authority.class);

        if (authority == null) {
            // 如果注解为null, 说明不需要拦截, 直接放过
            return true;
        }
        // 这里为了方便直接传递了参数
        // 一般的做法是用户第一次登录，将信息放到session中
        // 以后每次操作时从request中获取session，从session中获取用户信息
        // 然后根据用户信息从数据库中查权限信息
        String userAuthority = request.getParameter("userAuthority");
        String adminName = "admin";
        if (!adminName.equals(userAuthority)) {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print("没有权限");
            out.flush();
            out.close();
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
