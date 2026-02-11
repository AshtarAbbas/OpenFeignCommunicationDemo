package com.eureka.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyFeignController {
    private MyFeignClient client;

    public MyFeignController(MyFeignClient client) {
        this.client = client;
    }

    @GetMapping("/myname")
    public String getName(){
        return client.name();
    }
}
