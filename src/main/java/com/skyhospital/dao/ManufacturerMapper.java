package com.skyhospital.dao;

import com.skyhospital.pojo.Manufacturer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {


    int deleteByPrimaryKey(Integer manufacturerId);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);


    Manufacturer selectByPrimaryKey(Integer manufacturerId);



    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
}