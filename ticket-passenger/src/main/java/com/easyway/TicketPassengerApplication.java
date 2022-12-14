package com.easyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ZSY
 */
@EnableFeignClients(basePackages = "com.easyway.passenger.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class TicketPassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketPassengerApplication.class, args);
    }

}
