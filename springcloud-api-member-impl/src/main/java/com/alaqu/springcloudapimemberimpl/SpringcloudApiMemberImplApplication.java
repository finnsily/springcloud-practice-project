package com.alaqu.springcloudapimemberimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudApiMemberImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApiMemberImplApplication.class, args);
    }

}
