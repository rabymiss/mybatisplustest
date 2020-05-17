package com.example.demomybatisp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demomybatisp.mapper")
public class DemomybatispApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomybatispApplication.class, args);
    }

}
