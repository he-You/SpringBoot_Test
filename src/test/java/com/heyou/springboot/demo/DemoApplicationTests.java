package com.heyou.springboot.demo;

import com.heyou.springboot.demo.entity.User;
import com.heyou.springboot.demo.service.AsynService;
import org.apache.commons.collections4.ListUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private AsynService asynService;

    @Test
    public void contextLoads() {
    }

    @Test
    @Transactional(rollbackFor = Exception.class)
    public void write() throws Exception {
        List<User> userList = new ArrayList<>();
        for(int i=1;i<=10000;i++){
            User user = new User();
            user.setSn(i);
            user.setUsername("heyou-"+i);
            user.setPassword("password-"+i);
            userList.add(user);
            //asynService.batchInsertData();
        }
        long startTime = System.currentTimeMillis();
        //asynService.batchInsertData(userList);
        List<List<User>> subs = ListUtils.partition(userList, 100);
        for (List<User> users:subs){
            asynService.batchInsertData(users);
            asynService.insertLog(users.indexOf(subs), UUID.randomUUID().toString());
        }
        long used = System.currentTimeMillis() - startTime;
        System.out.println(used);
    }
}
