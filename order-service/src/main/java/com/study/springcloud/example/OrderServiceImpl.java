package com.study.springcloud.example;

import com.study.springcloud.example.api.IOrderService;
import com.study.springcloud.example.bo.Order;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhuYanjun
 * @Date: 2020/7/23 14:59
 * @Description:
 * @Version 1.0
 */
@RestController
public class OrderServiceImpl implements IOrderService {
    @Override
    public String orders() {
        return "all orders list";
    }

    @Override
    public String insert(Order order) {
        return order.toString();
    }
}
