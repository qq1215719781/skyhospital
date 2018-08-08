package com.skyhospital.dao;

import com.skyhospital.pojo.Sellaccount;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellaccountMapper {

    int deleteByPrimaryKey(String sellAccountId);

    int insert(Sellaccount record);

    int insertSelective(Sellaccount record);

    Sellaccount selectByPrimaryKey(String sellAccountId);


    int updateByPrimaryKeySelective(Sellaccount record);

    int updateByPrimaryKey(Sellaccount record);
}