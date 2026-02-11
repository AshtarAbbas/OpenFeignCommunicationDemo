package com.eureka.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign-client",
path = "/api")
public interface MyFeignClient {

    @GetMapping("/name")
    public String name();

}
