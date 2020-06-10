package com.wer.model.mapper;

import com.wer.model.entity.OauthRefreshToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OauthRefreshTokenMapper {
    int insert(OauthRefreshToken record);

    int insertSelective(OauthRefreshToken record);
}