package com.heyou.springboot.demo.service.impl;

import com.heyou.springboot.demo.entity.User;
import com.heyou.springboot.demo.dao.UserDao;
import com.heyou.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-04-20 21:28:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sn 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer sn) {
        return this.userDao.queryById(sn);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    @Override
    public int insertList(List<User> userList) {
        return userDao.insertList(userList);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getSn());
    }

    /**
     * 通过主键删除数据
     *
     * @param sn 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sn) {
        return this.userDao.deleteById(sn) > 0;
    }
}