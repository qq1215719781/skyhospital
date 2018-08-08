package com.skyhospital.dao;

import com.skyhospital.pojo.Buyer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerMapper {

    int deleteByPrimaryKey(Integer buyerId);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Integer buyerId);


    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}