package com.dengwang.service.impl;

import cn.dengwang.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dengwang.pojo.User;
import com.dengwang.pojo.UserExample;
import com.dengwang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;
import java.util.List;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getid(Integer id) {

        User user=userMapper.selectByPrimaryKey(id);
        System.out.println("serviceImpl"+user);
        return user;
    }

    @Override
    public User log(String userName, String password) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andPasswordEqualTo(password);
         List<User> users =userMapper.selectByExample(userExample);
         if(users.size()>0){
             return users.get(0);
         }
        return null;
    }
}
