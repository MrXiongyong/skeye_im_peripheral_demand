package com.tianyan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkeyeImPeripheralDemandApplication {

    private static final Logger log = LoggerFactory.getLogger(SkeyeImPeripheralDemandApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SkeyeImPeripheralDemandApplication.class, args);
        log.info("boot success");
    }

}
