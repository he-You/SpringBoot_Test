package com.heyou.springboot.demo.service;

import com.heyou.springboot.demo.entity.User;

import java.util.List;

/**
 * @author heyou(heyou_0423 @ 163.com)
 * @date 2020/7/16 22:35
 */
public interface AsynService {
    /**
     * 执行方法
     */
    void writeData(String data);

    void batchInsertData(List<User> users) throws Exception;

    void insertLog(int sn,String id);
}
