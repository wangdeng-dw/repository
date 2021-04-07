package com.dengwang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dengwang.entity.QueryPageBean;
import com.dengwang.entity.Result;
import com.dengwang.health.constant.MessageConstant;
import com.dengwang.pojo.Checkitem;
import com.dengwang.service.CheckItemService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {
    @Reference
    CheckItemService checkItemService;
    @RequestMapping("/getAll")
    public Object getAllCheckitem(){
        List<Checkitem> checkitemList=checkItemService.getAllCheckItem();
        System.out.println("初始化方法");
        return checkitemList;
    }
    @RequestMapping("/findPage")
    public Result findPage(@RequestBody(required=false)QueryPageBean queryPageBean){
        System.out.println(queryPageBean);
      /*  try {
            queryPageBean=JSON.parseObject(request.getInputStream(), QueryPageBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println(queryPageBean);
        Map map=checkItemService.findPage(queryPageBean);
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,map);
    }
    @RequestMapping("/add")
    public boolean add(@RequestBody(required = false) Checkitem checkitem){

        return checkItemService.add(checkitem);
    }
    @RequestMapping("/delete")
    public boolean delete(Integer id){
        System.out.println("执行删除代码"+id );
        return checkItemService.delete(id);
    }
    @RequestMapping("/update")
    public boolean update(@RequestBody(required = false) Checkitem checkitem){

        return checkItemService.update(checkitem);
    }
    @RequestMapping("/getId")
    public Object getId(Integer id){

        return checkItemService.getId(id);
    }

}
