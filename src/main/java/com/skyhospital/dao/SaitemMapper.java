package com.skyhospital.dao;

import com.skyhospital.pojo.Saitem;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaitemMapper {

    int deleteByPrimaryKey(Integer SAItemId);

    int insert(Saitem record);

    int insertSelective(Saitem record);


    Saitem selectByPrimaryKey(Integer SAItemId);


    int updateByPrimaryKeySelective(Saitem record);

    int updateByPrimaryKey(Saitem record);
}