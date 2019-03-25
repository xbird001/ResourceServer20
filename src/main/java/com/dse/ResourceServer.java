package com.dse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.dse")
@EnableTransactionManagement
public class ResourceServer {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServer.class, args);
    }
}
