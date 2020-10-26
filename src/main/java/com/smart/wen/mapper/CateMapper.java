package com.smart.wen.mapper;

import com.smart.wen.entity.Cate;
import org.apache.ibatis.annotations.Param;

public interface CateMapper {
    int insertCate(@Param("cate") Cate cate);
    Cate selectListById(@Param("cateId") int cateId);
}
