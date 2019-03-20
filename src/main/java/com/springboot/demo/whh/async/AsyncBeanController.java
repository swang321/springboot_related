package com.springboot.demo.whh.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author whh
 */
@Controller
public class AsyncBeanController {

    @Autowired
    private AsyncBean asyncBean;


    @RequestMapping("hello")
    public List<String> contextLoads() {

        List<String> list = new ArrayList<>();
        list.add("你好呀");
        list.add(asyncBean.sayHello());
        list.add("what?");

        return list;
    }

}
