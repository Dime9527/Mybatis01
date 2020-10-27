package com.smart.wen.mapper;

import com.smart.wen.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    Order selectOrderByNo(@Param("no") Integer no);
    List<Order> selectOrderByUserId(@Param("userId") Integer userId);
}
