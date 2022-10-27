package com.duan.user.center.contorller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dmx")
public class MyController {

    @RequestMapping("/demo")
    public String index() {
        return "hello,world";
    }
}
