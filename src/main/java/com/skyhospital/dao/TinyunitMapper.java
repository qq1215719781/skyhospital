package com.skyhospital.dao;

import com.skyhospital.pojo.Tinyunit;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinyunitMapper {

    int deleteByPrimaryKey(Integer tinyUnitId);

    int insert(Tinyunit record);

    int insertSelective(Tinyunit record);


    Tinyunit selectByPrimaryKey(Integer tinyUnitId);


    int updateByPrimaryKeySelective(Tinyunit record);

    int updateByPrimaryKey(Tinyunit record);
}