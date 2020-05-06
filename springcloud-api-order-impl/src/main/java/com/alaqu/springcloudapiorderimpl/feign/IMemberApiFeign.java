package com.alaqu.springcloudapiorderimpl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IMemberApiFeign <br>
 * @Author finn <br>
 * @Date 2020/5/5 3:34 PM <br>
 * @blog https://www.finn.ink <br>
 * @email finn@alaqu.com <br>
 * @Description TODO <br>
 * @Version 1.0 <br>
 **/

@Repository
@FeignClient(name = "alaqu-springcloud-api-member-impl")
public interface IMemberApiFeign {

    @GetMapping(value = "getMember")
    String getMember();
}
