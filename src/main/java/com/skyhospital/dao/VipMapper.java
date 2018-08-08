package com.skyhospital.dao;

import com.skyhospital.pojo.Vip;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipMapper {

    int deleteByPrimaryKey(String vid);

    int insert(Vip record);

    int insertSelective(Vip record);


    Vip selectByPrimaryKey(String vid);


    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}