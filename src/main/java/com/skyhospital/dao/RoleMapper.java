package com.skyhospital.dao;

import com.skyhospital.pojo.Role;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

    int deleteByPrimaryKey(String RID);

    int insert(Role record);

    int insertSelective(Role record);


    Role selectByPrimaryKey(String RID);


    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}