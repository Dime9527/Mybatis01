package com.smart.wen.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    /**
     *
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 0表示未支付 1 表示支付
     */
    private Integer status;

    //订单对应的用户
    private User user;
    private List<OrderItm> orderItms;

    private static final long serialVersionUID = 1L;

    public List<OrderItm> getOrderItms() {
        return orderItms;
    }

    public void setOrderItms(List<OrderItm> orderItms) {
        this.orderItms = orderItms;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", status=" + status +
                ", user=" + user +
                ", orderItms=" + orderItms +
                '}';
    }
}

