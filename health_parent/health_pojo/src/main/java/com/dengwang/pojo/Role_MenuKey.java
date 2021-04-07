package com.dengwang.pojo;

import java.io.Serializable;

public class Role_MenuKey implements Serializable {
    private Integer role_id;

    private Integer menu_id;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }
}