package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 朱志臣
 * @Date: 2021/09/29/19:19
 * @Description:
 */
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public Map<String,Object> hello(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name", "朱志臣");
        map.put("sex", "12");
        return map;

    }
}
