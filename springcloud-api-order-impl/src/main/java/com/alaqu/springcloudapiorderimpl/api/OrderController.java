package com.alaqu.springcloudapiorderimpl.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController <br>
 * @Author finn <br>
 * @Date 2020/5/5 10:10 AM <br>
 * @blog https://www.finn.ink <br>
 * @email finn@alaqu.com <br>
 * @Description TODO <br>
 * @Version 1.0 <br>
 **/

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "getOrder")
    public String getOrder() {
        String result = restTemplate.getForObject("http://alaqu-springcloud-api-member-impl/getMember", String.class);
        return result;
    }
}
