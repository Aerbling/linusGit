package com.hema.regi_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fg
 * @Time: 2022-09-28 16:47
 * @function:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("")
    public String hello(){
        System.out.println("hello world");
        System.out.println("see you again");
        System.out.println("在这个世界里，如果你有太多的抱怨");
        return "Ok";
    }

}
