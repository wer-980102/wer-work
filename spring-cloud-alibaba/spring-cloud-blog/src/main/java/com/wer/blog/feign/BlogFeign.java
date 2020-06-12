package com.wer.blog.feign;

import com.wer.blog.feign.Fallback.BlogServiceFallbackFactory;
import com.wer.model.entity.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "model",path = "/feign"
        ,fallbackFactory = BlogServiceFallbackFactory.class)
public interface BlogFeign {

    @RequestMapping(value = "/blog/selectBlog", method = RequestMethod.GET)
    List<Blog> selectBlog();
}
