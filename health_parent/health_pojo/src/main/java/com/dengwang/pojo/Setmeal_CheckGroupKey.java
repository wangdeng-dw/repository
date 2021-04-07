package com.dengwang.pojo;

import java.io.Serializable;

public class Setmeal_CheckGroupKey implements Serializable {
    private Integer setmeal_id;

    private Integer checkgroup_id;

    public Integer getSetmeal_id() {
        return setmeal_id;
    }

    public void setSetmeal_id(Integer setmeal_id) {
        this.setmeal_id = setmeal_id;
    }

    public Integer getCheckgroup_id() {
        return checkgroup_id;
    }

    public void setCheckgroup_id(Integer checkgroup_id) {
        this.checkgroup_id = checkgroup_id;
    }
}