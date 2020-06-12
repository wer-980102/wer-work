package com.wer.model.mapper;

import com.wer.model.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {
    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectBlog();
}