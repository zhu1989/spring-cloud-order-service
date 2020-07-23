package com.study.springcloud.example.feignclient;

import com.study.springcloud.example.api.IOrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: zhuYanjun
 * @Date: 2020/7/23 13:16
 * @Description:
 * @Version 1.0
 */
@FeignClient("order-service")
public interface IOrderServiceClient extends IOrderService {
}
