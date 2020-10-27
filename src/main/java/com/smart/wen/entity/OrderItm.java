package com.smart.wen.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItm implements Serializable {
    /**
     *
     */
    private Integer itemId;

    /**
     *
     */
    private Integer orderId;

    /**
     *
     */
    private String productName;

    /**
     *
     */
    private String productImg;

    /**
     *
     */
    private BigDecimal productPrice;

    /**
     *
     */
    private Integer productQuantity;

    private static final long serialVersionUID = 1L;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

}

