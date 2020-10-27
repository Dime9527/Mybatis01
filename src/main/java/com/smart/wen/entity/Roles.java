package com.smart.wen.entity;

import java.io.Serializable;
import java.util.List;

public class Roles implements Serializable {
    /**
     *
     */
    private Integer roleId;

    /**
     * 角色的名称
     */
    private String roleName;

    /**
     * 角色的说明
     */
    private String dec;

    /**
     * 0表示未删除 1表示删除
     */
    private Integer isDel;

    /**
     *
     */
    private Integer uid;

    private List<Privilege> privileges;

    private static final long serialVersionUID = 1L;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", dec='" + dec + '\'' +
                ", isDel=" + isDel +
                ", uid=" + uid +
                ", privileges=" + privileges +
                '}';
    }
}

