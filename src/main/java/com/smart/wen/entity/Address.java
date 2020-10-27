package com.smart.wen.entity;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     *
     */
    private Integer addrId;

    /**
     *
     */
    private Integer uid;
    private Integer isDelete;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private String addr;

    /**
     *
     */
    private String detail;

    /**
     * 1位默认地址
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Address(Integer addrId, Integer uid, String name, String phone, String addr, String detail, Integer status) {
        this.addrId = addrId;
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.detail = detail;
        this.status = status;
    }

    public Address(Integer uid, String name, String phone, String addr, String detail) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.detail = detail;
    }
    public Address(String name, String phone, String addr, String detail) {
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.detail = detail;
    }

    public Address() {
    }
}

