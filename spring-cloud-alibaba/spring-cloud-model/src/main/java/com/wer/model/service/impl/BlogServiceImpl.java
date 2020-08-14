package com.wer.model.service.impl;

import com.wer.model.entity.Blog;
import com.wer.model.mapper.BlogMapper;
import com.wer.model.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BlogServiceImpl  implements BlogService {

    @Autowired
    private BlogMapper blogMapper;


    public List<Blog> selectBlog() {
        return blogMapper.selectBlog();
    }
}
