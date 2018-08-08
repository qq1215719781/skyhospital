package com.skyhospital.dao;

import com.skyhospital.pojo.Privilege;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeMapper {


    int deleteByPrimaryKey(Integer PID);

    int insert(Privilege record);

    int insertSelective(Privilege record);


    Privilege selectByPrimaryKey(Integer PID);



    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}