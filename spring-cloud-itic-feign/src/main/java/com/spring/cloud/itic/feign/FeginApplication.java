package com.spring.cloud.itic.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //注册到eureka
@EnableFeignClients  //启用Fegin客户端
//@EnableHystrixDashboard //开启熔断器监控
public class FeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class, args);
    }

}
