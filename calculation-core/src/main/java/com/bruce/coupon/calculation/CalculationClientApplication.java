package com.bruce.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bruce"})
@EnableDiscoveryClient
public class CalculationClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculationClientApplication.class, args);
    }
}
