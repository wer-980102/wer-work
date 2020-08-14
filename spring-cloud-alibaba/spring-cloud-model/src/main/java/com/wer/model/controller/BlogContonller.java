package com.wer.model.controller;

import com.wer.common.domain.common.ResponseVo;
import com.wer.model.entity.Blog;
import com.wer.model.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
public class BlogContonller{

    @Autowired
    private BlogService blogService;

    @GetMapping("/feign/blog/selectBlog")
    public List<Blog> selectBlog() {
        return blogService.selectBlog();
    }
}
