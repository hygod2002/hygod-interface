package com.hygod.hygodinterface;

import com.hygod.hygodclintsdk.clint.HygodClint;
import com.hygod.hygodclintsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class HygodInterfaceApplicationTests {
    
    @Resource HygodClint hygodClint ;
    @Test
    void contextLoads() {
        String result = hygodClint.getNameByGet("hygod");
        String result2 = hygodClint.getNameByPost("hygod");
        String result3 = hygodClint.getUsernameByPost(new User("hygod"));
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

}
