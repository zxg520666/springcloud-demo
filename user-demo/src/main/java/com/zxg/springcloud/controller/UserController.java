package com.zxg.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") int id){
        if (id == 1) {
            return "yidiankt";
        } else if (id == 2) { return "程老师";
        } else {
            return "多岸教育";
        }
    }
}
