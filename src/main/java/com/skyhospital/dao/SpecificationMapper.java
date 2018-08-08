package com.skyhospital.dao;

import com.skyhospital.pojo.Specification;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationMapper {

    int deleteByPrimaryKey(Integer specificationID);

    int insert(Specification record);

    int insertSelective(Specification record);


    Specification selectByPrimaryKey(Integer specificationID);


    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}