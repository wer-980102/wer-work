package com.wer.model.controller;

import com.wer.common.domain.common.ResponseVo;
import com.wer.model.entity.Blog;
import com.wer.model.service.BlogService;
import com.wer.model.service.impl.BlogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BlogContonller implements BlogService {
    @Autowired
    private BlogServiceImpl blogService;

    @RequestMapping("/feign/blog/selectBlog")
    @Override
    public List<Blog> selectBlog() {
        return blogService.selectBlog();
    }
}
