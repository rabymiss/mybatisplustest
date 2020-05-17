package com.example.demomybatisp;

import com.example.demomybatisp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 class text {
    @Autowired
 private    UserMapper userMapper;
    @Test
    void Test(){
        userMapper.selectList(null).forEach(System.out::print);

    }
}
