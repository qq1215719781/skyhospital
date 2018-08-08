package com.skyhospital.dao;

import com.skyhospital.pojo.Goodsallocation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsallocationMapper {

    int deleteByPrimaryKey(Integer GAID);

    int insert(Goodsallocation record);

    int insertSelective(Goodsallocation record);


    Goodsallocation selectByPrimaryKey(Integer GAID);

    int updateByPrimaryKeySelective(Goodsallocation record);

    int updateByPrimaryKey(Goodsallocation record);
}