package com.heizer.FrameworkDigitalBlogRestApi.controllers;

import com.heizer.FrameworkDigitalBlogRestApi.model.BlogPost;
import com.heizer.FrameworkDigitalBlogRestApi.repository.BlogPostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/blogposts")
public class BlogPostController
{
    private final BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostRepository blogPostRepository)
    {
        this.blogPostRepository = blogPostRepository;
    }

    @GetMapping
    public List<BlogPost> getPosts()
    {
        return blogPostRepository.findAllWithTruncatedContent();
    }

    @GetMapping("/{blogPostId}")
    public BlogPost getPostById(@PathVariable long blogPostId)
    {
        // TODO: Not finished
        return blogPostRepository.findById(blogPostId)
                                 .orElseThrow(() -> new RuntimeException("Post id can't be found"));
    }

}
