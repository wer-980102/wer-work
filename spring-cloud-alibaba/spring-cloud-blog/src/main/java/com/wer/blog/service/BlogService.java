package com.wer.blog.service;

import com.wer.common.domain.common.ResponseVo;
import com.wer.model.entity.Blog;

import java.util.List;

public interface BlogService {

    ResponseVo<List<Blog>> selectBlog();
}
