package com.skyhospital.dao;

import com.skyhospital.pojo.Mtiny;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtinyMapper {


    int deleteByPrimaryKey(Integer MTID);

    int insert(Mtiny record);

    int insertSelective(Mtiny record);


    Mtiny selectByPrimaryKey(Integer MTID);



    int updateByPrimaryKeySelective(Mtiny record);

    int updateByPrimaryKey(Mtiny record);
}