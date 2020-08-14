package com.wer.blog.controller;

import com.wer.blog.service.impl.BlogServiceImpl;
import com.wer.common.domain.common.ResponseVo;
import com.wer.common.domain.entity.Blog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/log")
public class BlogContonller {
    @Autowired
    private BlogServiceImpl blogService;

    @GetMapping("/selectBlog")
    public ResponseVo  userAgeStage() {
        System.out.println("----------------进来了------------------------");
        return blogService.selectBlog();
    }

    @GetMapping("/test")
    public ResponseVo  test() {
        System.out.println("----------------进来测试方法了------------------------");
        return blogService.test();
    }
}
