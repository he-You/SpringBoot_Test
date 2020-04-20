package com.heyou.springboot.demo.controller;

import com.heyou.springboot.demo.entity.User;
import com.heyou.springboot.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-04-20 21:28:57
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        User user = userService.queryById(id);
        System.out.println(user);
        return user;
    }

    @GetMapping("insertList")
    public int batchInsert(){
        List<User> userList = Arrays.asList(
                new User(1, null,"heyou1","123"),
                new User(2, null,"heyou2","1234"),
                new User(3, null,"heyou3","1235"),
                new User(4, null,"heyou4","1236"),
                new User(5, null,"heyou5","1237")
                );
        int result = userService.insertList(userList);
        return result;
    }

}