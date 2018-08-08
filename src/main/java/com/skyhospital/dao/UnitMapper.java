package com.skyhospital.dao;

import com.skyhospital.pojo.Unit;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitMapper {

    int deleteByPrimaryKey(Integer unitID);

    int insert(Unit record);

    int insertSelective(Unit record);


    Unit selectByPrimaryKey(Integer unitID);


    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}