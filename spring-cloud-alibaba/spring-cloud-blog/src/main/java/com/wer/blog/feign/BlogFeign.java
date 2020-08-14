package com.wer.blog.feign;

import com.wer.blog.feign.Fallback.BlogServiceFallbackFactory;
import com.wer.common.domain.common.ResponseVo;
import com.wer.common.domain.entity.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "model"
        ,fallbackFactory = BlogServiceFallbackFactory.class)
public interface BlogFeign {

    @GetMapping("/feign/blog/selectBlog")
    List<Blog> selectBlog();

    @GetMapping("/test/testData")
    ResponseVo test();
}
