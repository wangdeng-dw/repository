package com.dengwang.service;

import com.dengwang.entity.PageResult;
import com.dengwang.entity.QueryPageBean;
import com.dengwang.pojo.Checkitem;

import java.util.List;
import java.util.Map;

public interface CheckItemService {
    List<Checkitem> getAllCheckItem();
    Map findPage(QueryPageBean queryPageBean);
    boolean add(Checkitem checkitem);
    boolean delete(Integer id);
    boolean update(Checkitem checkitem);
    Checkitem getId(Integer id );

}
