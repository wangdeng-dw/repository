package cn.dengwang.controller;

import cn.dengwang.pojo.User;
import cn.dengwang.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("select")
    @ResponseBody
    public Object selectUser(){
        List<User> userList=userService.selectUser();
        Map map=new HashMap();
        map.put("userList",userList);
        Object obj= JSONArray.toJSON(map);
        System.out.println("userList"+obj);
     return obj;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Object deleteUser(HttpServletRequest request){

        boolean flag=userService.deleteUser(new Long(request.getParameter("id")));
        Map map=new HashMap();
        map.put("flag",flag);
        Object obj=JSONArray.toJSON(map);
        return obj;
    }
}
