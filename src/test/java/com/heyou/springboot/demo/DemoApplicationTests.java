package com.heyou.springboot.demo;

import com.heyou.springboot.demo.entity.User;
import com.heyou.springboot.demo.service.AsynService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private AsynService asynService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void write() {
        List<User> userList = new ArrayList<>();
        for(int i=0;i<10000;i++){
            User user = new User();
            user.setSn(i);
            user.setUsername("heyou-"+i);
            user.setPassword("password-"+i);
            userList.add(user);
            //asynService.batchInsertData();
        }
    }
}
