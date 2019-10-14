package com.zxg.springcloud.controller;

import com.zxg.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/order")
    public String addOrder(String name) {
        // 调用用户，查询用户信息，
        String result = orderService.getUser(2);
        return "生成订单：" + result;
    }
}
