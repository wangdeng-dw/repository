package com.dengwang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONArray;
import com.dengwang.pojo.User;
import com.dengwang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("/getId")
    public User  getId( Integer id){
        User user=userService.getid(id);
        return user;
    }

    @RequestMapping("/login")
    public Object login(String userName, String password, HttpServletRequest request){
        System.out.println("账号"+userName);
        System.out.println("密码"+password);
        User user=userService.log(userName,password);
        Map map=new HashMap();
        if (user!=null){
            HttpSession session=request.getSession();
            session.setAttribute("user",user);
            return true;
        }

        return false;
    }
    @RequestMapping("/getName")
    public String getName(HttpServletRequest request){
        System.out.println("是否跳转此页面");
        HttpSession session=request.getSession();
        User user =(User) session.getAttribute("user");
        System.out.println(user);
        System.out.println(user.getUsername());
        return user.getUsername();
    }

}
