package cn.dengwang.service;

import cn.dengwang.mapper.UserMapper;
import cn.dengwang.pojo.User;
import cn.dengwang.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl  implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectUser() {
        UserExample userExample=new UserExample();
        List<User>  users=userMapper.selectByExample(userExample);
        System.out.println(users);
        return users;
    }
    @Override
    public boolean deleteUser(Long id){

        return userMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}
