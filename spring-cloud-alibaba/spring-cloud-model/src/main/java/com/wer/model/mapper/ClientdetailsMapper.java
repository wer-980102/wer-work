package com.wer.model.mapper;

import com.wer.model.entity.Clientdetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientdetailsMapper {
    int deleteByPrimaryKey(String appid);

    int insert(Clientdetails record);

    int insertSelective(Clientdetails record);

    Clientdetails selectByPrimaryKey(String appid);

    int updateByPrimaryKeySelective(Clientdetails record);

    int updateByPrimaryKey(Clientdetails record);
}