package com.dengwang.pojo;

import java.io.Serializable;

public class Checkgroup_CheckitemKey implements Serializable {
    private Integer checkgroup_id;

    private Integer checkitem_id;

    public Integer getCheckgroup_id() {
        return checkgroup_id;
    }

    public void setCheckgroup_id(Integer checkgroup_id) {
        this.checkgroup_id = checkgroup_id;
    }

    public Integer getCheckitem_id() {
        return checkitem_id;
    }

    public void setCheckitem_id(Integer checkitem_id) {
        this.checkitem_id = checkitem_id;
    }
}