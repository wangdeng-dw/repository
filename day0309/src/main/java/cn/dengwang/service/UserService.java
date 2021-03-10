package cn.dengwang.service;

import cn.dengwang.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> selectUser();

    public boolean deleteUser(Long id);
}
