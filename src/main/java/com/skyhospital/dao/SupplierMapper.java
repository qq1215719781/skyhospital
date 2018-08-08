package com.skyhospital.dao;

import com.skyhospital.pojo.Supplier;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {

    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);


    Supplier selectByPrimaryKey(Integer supplierId);


    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}