package com.skyhospital.dao;

import com.skyhospital.pojo.Procurementplan;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcurementplanMapper {


    int deleteByPrimaryKey(Integer PPID);

    int insert(Procurementplan record);

    int insertSelective(Procurementplan record);


    Procurementplan selectByPrimaryKey(Integer PPID);


    int updateByPrimaryKeySelective(Procurementplan record);

    int updateByPrimaryKey(Procurementplan record);
}