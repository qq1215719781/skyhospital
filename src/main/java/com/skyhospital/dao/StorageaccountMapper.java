package com.skyhospital.dao;

import com.skyhospital.pojo.Storageaccount;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageaccountMapper {

    int deleteByPrimaryKey(String storageAccountId);

    int insert(Storageaccount record);

    int insertSelective(Storageaccount record);


    Storageaccount selectByPrimaryKey(String storageAccountId);


    int updateByPrimaryKeySelective(Storageaccount record);

    int updateByPrimaryKey(Storageaccount record);
}