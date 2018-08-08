package com.skyhospital.dao;

import com.skyhospital.pojo.Medicinekind;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinekindMapper {


    int deleteByPrimaryKey(Integer medicineKindID);

    int insert(Medicinekind record);

    int insertSelective(Medicinekind record);


    Medicinekind selectByPrimaryKey(Integer medicineKindID);



    int updateByPrimaryKeySelective(Medicinekind record);

    int updateByPrimaryKey(Medicinekind record);
}