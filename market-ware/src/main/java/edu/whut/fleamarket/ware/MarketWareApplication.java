package edu.whut.fleamarket.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("edu.whut.fleamarket.ware.dao")
@SpringBootApplication
public class MarketWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketWareApplication.class, args);
    }

}
