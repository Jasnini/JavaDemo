package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * 
 * @create: 2018-05-08-下午 16:46
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!i am iiiii";
    }
}