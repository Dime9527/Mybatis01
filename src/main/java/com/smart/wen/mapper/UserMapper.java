package com.smart.wen.mapper;

import com.smart.wen.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);
    User selectUserById(@Param("id")int id);
}
