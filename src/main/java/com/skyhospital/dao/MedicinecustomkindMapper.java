package com.skyhospital.dao;

import com.skyhospital.pojo.Medicinecustomkind;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinecustomkindMapper {


    int deleteByPrimaryKey(Integer MCKID);

    int insert(Medicinecustomkind record);

    int insertSelective(Medicinecustomkind record);


    Medicinecustomkind selectByPrimaryKey(Integer MCKID);


    int updateByPrimaryKeySelective(Medicinecustomkind record);

    int updateByPrimaryKey(Medicinecustomkind record);
}