package com.skyhospital.dao;

import com.skyhospital.pojo.Warehouse;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMapper {

    int deleteByPrimaryKey(Integer warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);


    Warehouse selectByPrimaryKey(Integer warehouseId);


    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}