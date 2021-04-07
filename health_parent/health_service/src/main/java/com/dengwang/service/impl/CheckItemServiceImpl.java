package com.dengwang.service.impl;

import cn.dengwang.mapper.CheckitemMapper;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.dengwang.entity.PageResult;
import com.dengwang.entity.QueryPageBean;
import com.dengwang.pojo.Checkitem;
import com.dengwang.pojo.CheckitemExample;
import com.dengwang.service.CheckItemService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    CheckitemMapper checkitemMapper;
    @Override
    public List<Checkitem> getAllCheckItem() {
        CheckitemExample checkitemExample=new CheckitemExample();
        List<Checkitem> checkitemList=checkitemMapper.selectByExample(checkitemExample);

        return checkitemList;
    }

    @Override
    public Map findPage(QueryPageBean queryPageBean) {
        PageHelper.startPage(queryPageBean.getCurrentPage(),queryPageBean.getPageSize());
        CheckitemExample checkitemExample=new CheckitemExample();
        //拼接模糊查询
        if(!StringUtils.isEmpty(queryPageBean.getQueryString())){
            queryPageBean.setQueryString("%"+queryPageBean.getQueryString()+"%");
            CheckitemExample.Criteria criteria=checkitemExample.createCriteria();
            criteria.andNameLike(queryPageBean.getQueryString());
            criteria.andCodeLike(queryPageBean.getQueryString());
        }
        //紧接着的查询语句会被分页
        List<Checkitem> checkitemList=checkitemMapper.selectByExample(checkitemExample);

        PageInfo<Checkitem> pageInfo=new PageInfo<Checkitem>(checkitemMapper.selectByExample(checkitemExample));
        System.out.println("总页数"+pageInfo.getTotal());
        Map map=new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",checkitemList);


        return map;
    }

    @Override
    public boolean add(Checkitem checkitem) {
        int a=checkitemMapper.insert(checkitem);
        return a>0?true:false;
    }

    @Override
    public boolean delete(Integer id) {
        int a=checkitemMapper.deleteByPrimaryKey(id);
        return a>0?true:false;
    }

    @Override
    public boolean update(Checkitem checkitem) {
        int a=checkitemMapper.updateByPrimaryKey(checkitem);
        return a>0?true:false;
    }

    @Override
    public Checkitem getId(Integer id) {
        return checkitemMapper.selectByPrimaryKey(id);
    }
}
