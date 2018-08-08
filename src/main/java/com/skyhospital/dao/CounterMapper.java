package com.skyhospital.dao;

import com.skyhospital.pojo.Counter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounterMapper {


    int deleteByPrimaryKey(Integer counterID);

    int insert(Counter record);

    int insertSelective(Counter record);


    Counter selectByPrimaryKey(Integer counterID);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}