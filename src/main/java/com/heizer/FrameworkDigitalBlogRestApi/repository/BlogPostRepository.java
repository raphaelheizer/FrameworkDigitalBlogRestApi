package com.heizer.FrameworkDigitalBlogRestApi.repository;

import com.heizer.FrameworkDigitalBlogRestApi.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>
{
    @Query(value = """
                    SELECT id, view_count, author, timestamp, category, TRIM(SUBSTRING(content, 1, 100)) || '...'
                    as content, title FROM blog.blog_post
            """,
            nativeQuery = true)
    List<BlogPost> findAllWithTruncatedContent();
}
