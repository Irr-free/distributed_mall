package edu.whut.fleamarket.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("edu.whut.fleamarket.coupon.dao")
@SpringBootApplication
public class MarketCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketCouponApplication.class, args);
    }

}
