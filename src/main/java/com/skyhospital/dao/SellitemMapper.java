package com.skyhospital.dao;

import com.skyhospital.pojo.Sellitem;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellitemMapper {

    int deleteByPrimaryKey(Integer sellItem);

    int insert(Sellitem record);

    int insertSelective(Sellitem record);


    Sellitem selectByPrimaryKey(Integer sellItem);

    int updateByPrimaryKeySelective(Sellitem record);

    int updateByPrimaryKey(Sellitem record);
}