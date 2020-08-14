package com.wer.blog.service.impl;

import com.wer.blog.feign.BlogFeign;
import com.wer.blog.service.BlogService;
import com.wer.common.domain.common.ResponseVo;
import com.wer.common.domain.entity.Blog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BlogServiceImpl  implements BlogService {

    @Autowired
    private BlogFeign blogFeign;

    @Override
    public ResponseVo selectBlog() {
        return ResponseVo.success(blogFeign.selectBlog());
    }

    @Override
    public ResponseVo test() {
        return ResponseVo.success(blogFeign.test());
    }
}
