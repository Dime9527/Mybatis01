package com.smart.wen.mapper;

import com.smart.wen.entity.Test;
import org.apache.ibatis.annotations.Param;

public interface TestInsertMapper {
    int insert(@Param("test") Test test);
}
