package com.study.springcloud.example.api;

import com.study.springcloud.example.bo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: zhuYanjun
 * @Date: 2020/7/23 13:12
 * @Description:
 * @Version 1.0
 */
public interface IOrderService {

    @GetMapping("orders")
    String orders();

    @PostMapping("insert")
    String insert(Order order);
}
