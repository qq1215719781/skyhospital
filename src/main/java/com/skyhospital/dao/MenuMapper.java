package com.skyhospital.dao;

import com.skyhospital.pojo.Menu;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {


    int deleteByPrimaryKey(Integer MID);

    int insert(Menu record);

    int insertSelective(Menu record);


    Menu selectByPrimaryKey(Integer MID);


    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}