package com.smart.wen.mapper;

import com.smart.wen.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    List<Address> selectByUid(@Param("uid") Integer uid);
    int addAddress(@Param("address")Address address);
    int modifyAddress(@Param("address")Address address);
    int deleteAddress(@Param("id")Integer id);
}
