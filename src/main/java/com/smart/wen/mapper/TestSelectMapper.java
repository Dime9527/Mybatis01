package com.smart.wen.mapper;

import com.smart.wen.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestSelectMapper {
    /*
    * 方法的命名 一般使用SQL的关键字
    * 返回值，返回值对应的持久化或者集合
    * 参数，如果参数数量比较少，使用基本类型， 如果多使用对象，不要使用map
    * 一个mapper对应一个数据库表的操作
    * 能用id尽量使用id，id是最快的
     * */
    Test selectTestById(@Param("id") Integer id );
    List<Test> selectList(@Param("page")Integer page,@Param("size")Integer size);

}
