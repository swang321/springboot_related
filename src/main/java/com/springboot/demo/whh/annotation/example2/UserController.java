package com.springboot.demo.whh.annotation.example2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author whh
 */
@RestController
public class UserController {

    @RequestMapping("login")
    public Map login() {
        Map<String, String> map = new HashMap<>(16);
        map.put("msg", "login success");
        return map;
    }

    @Authority()
    @RequestMapping(value = "queryAllProduct", method = RequestMethod.GET)
    public Map queryAllProduct() {
        Map<String, String> map = new HashMap<>(16);
        map.put("msg", "this is all data");
        return map;
    }

}
