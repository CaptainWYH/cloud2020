package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 魏渝辉
 * @Date:2022年08月10日 23:09
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
public class CloudGateWay9527Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateWay9527Application.class, args);
    }
}
