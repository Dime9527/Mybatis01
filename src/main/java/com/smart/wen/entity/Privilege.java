package com.smart.wen.entity;

import java.io.Serializable;

public class Privilege implements Serializable {
    /**
     *
     */
    private Integer privilegeId;

    /**
     * 权限的名称
     */
    private String name;

    /**
     * 权限的说明
     */
    private String dec;

    /**
     * 0表示未删除 1表示删除
     */
    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

