package com.dengwang.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dengwang.pojo.User;

public interface UserService {
    User getid(Integer id);
    User log(String userName,String password);
}
