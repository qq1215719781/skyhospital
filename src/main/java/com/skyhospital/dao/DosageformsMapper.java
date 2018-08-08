package com.skyhospital.dao;

import com.skyhospital.pojo.Dosageforms;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DosageformsMapper {


    int deleteByPrimaryKey(Integer dosageFormsID);

    int insert(Dosageforms record);

    int insertSelective(Dosageforms record);


    Dosageforms selectByPrimaryKey(Integer dosageFormsID);



    int updateByPrimaryKeySelective(Dosageforms record);

    int updateByPrimaryKey(Dosageforms record);
}