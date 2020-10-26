package com.smart.wen.mapper;

import com.smart.wen.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    int insertProduct(@Param("product") Product product);
}
