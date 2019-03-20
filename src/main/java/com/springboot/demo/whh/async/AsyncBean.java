package com.springboot.demo.whh.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author whh
 */
@Component
public class AsyncBean {

    @Async
    public String sayHello() {

        return "hello ";
    }

}
