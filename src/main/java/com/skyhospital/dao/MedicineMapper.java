package com.skyhospital.dao;

import com.skyhospital.pojo.Medicine;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineMapper {


    int deleteByPrimaryKey(Integer medicineID);

    int insert(Medicine record);

    int insertSelective(Medicine record);


    Medicine selectByPrimaryKey(Integer medicineID);


    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}