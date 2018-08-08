package com.skyhospital.dao;

import com.skyhospital.pojo.Goodskind;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodskindMapper {


    int deleteByPrimaryKey(Integer goodsKindID);

    int insert(Goodskind record);

    int insertSelective(Goodskind record);


    Goodskind selectByPrimaryKey(Integer goodsKindID);


    int updateByPrimaryKeySelective(Goodskind record);

    int updateByPrimaryKey(Goodskind record);
}