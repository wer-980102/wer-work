package com.wer.blog.feign.Fallback;

import com.wer.blog.feign.BlogFeign;
import com.wer.common.domain.common.ResponseVo;
import com.wer.model.entity.Blog;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public
class BlogServiceFallbackFactory implements FallbackFactory<BlogFeign> {

    @Override
    public BlogFeign create(Throwable throwable) {

        if(throwable == null) {
            return null;
        }
        final String msg = throwable.getMessage();
        log.info("exception:" + msg);
        return new BlogFeign() {
            @Override
            public List<Blog> selectBlog() {
                return new ArrayList<>();
            }
        };
    }
}
