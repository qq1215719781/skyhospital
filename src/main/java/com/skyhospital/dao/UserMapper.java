package com.skyhospital.dao;

import com.skyhospital.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int deleteByPrimaryKey(String UID);

    int insert(User record);

    int insertSelective(User record);


    User selectByPrimaryKey(String UID);


    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}