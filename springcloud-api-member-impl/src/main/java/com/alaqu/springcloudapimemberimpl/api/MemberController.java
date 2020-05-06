package com.alaqu.springcloudapimemberimpl.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MemberController <br>
 * @Author finn <br>
 * @Date 2020/5/5 9:56 AM <br>
 * @blog https://www.finn.ink <br>
 * @email finn@alaqu.com <br>
 * @Description TODO <br>
 * @Version 1.0 <br>
 **/

@RestController
public class MemberController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "getMember")
    public String getMember() {
        return "This is Member Api, port: " + port;
    }
}
