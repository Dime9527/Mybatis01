package com.smart.wen.mapper;

import com.smart.wen.entity.Roles;
import org.apache.ibatis.annotations.Param;

public interface RolesMapper {
    Roles selectById(@Param("id") Integer id);
    Roles selectByUid(@Param("uid")Integer uid);
}
