package com.skyhospital.dao;

import com.skyhospital.pojo.Shift;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiftMapper {

    int deleteByPrimaryKey(Integer shiftID);

    int insert(Shift record);

    int insertSelective(Shift record);


    Shift selectByPrimaryKey(Integer shiftID);


    int updateByPrimaryKeySelective(Shift record);

    int updateByPrimaryKey(Shift record);
}