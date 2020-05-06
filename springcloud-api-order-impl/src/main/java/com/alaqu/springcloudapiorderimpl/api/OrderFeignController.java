package com.alaqu.springcloudapiorderimpl.api;

import com.alaqu.springcloudapiorderimpl.feign.IMemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderFeignController <br>
 * @Author finn <br>
 * @Date 2020/5/5 3:41 PM <br>
 * @blog https://www.finn.ink <br>
 * @email finn@alaqu.com <br>
 * @Description TODO <br>
 * @Version 1.0 <br>
 **/

@RestController
public class OrderFeignController {

    @Autowired
    private IMemberApiFeign iMemberApiFeign;

    @GetMapping(value = "feignMember")
    public String feignMember() {
        return iMemberApiFeign.getMember();
    }
}
