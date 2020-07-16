package com.heyou.springboot.demo.service.impl;

import com.heyou.springboot.demo.dao.UserDao;
import com.heyou.springboot.demo.entity.User;
import com.heyou.springboot.demo.service.AsynService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author heyou(heyou_0423 @ 163.com)
 * @date 2020/7/16 22:42
 */
@Service
public class AsynServiceImpl implements AsynService {
    private static Logger logger = LogManager.getLogger(AsynServiceImpl.class.getName());

    @Resource
    private UserDao userDao;

    @Async("asyncServiceExecutor")
    @Override
    public void writeData(String data) {
        logger.info("线程-" + Thread.currentThread().getId() + "在执行写入:"+data);
    }

    @Override
    public void batchInsertData(List<User> users) {
        userDao.insertList(users);
    }
}
