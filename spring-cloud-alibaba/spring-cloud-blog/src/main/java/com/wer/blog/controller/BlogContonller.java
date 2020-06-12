package com.wer.blog.controller;

import com.wer.blog.service.impl.BlogServiceImpl;
import com.wer.common.domain.common.ResponseVo;
import com.wer.model.entity.Blog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/blog")
@Slf4j
public class BlogContonller {
    @Autowired
    private BlogServiceImpl blogService;
    @GetMapping("/selectBlog")
    public ResponseVo<List<Blog>> userAgeStage() {
        return blogService.selectBlog();
    }
}
