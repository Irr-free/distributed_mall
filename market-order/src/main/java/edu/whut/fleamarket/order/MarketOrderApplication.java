package edu.whut.fleamarket.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("edu.whut.fleamarket.order.dao")
@SpringBootApplication
public class MarketOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketOrderApplication.class, args);
    }

}
