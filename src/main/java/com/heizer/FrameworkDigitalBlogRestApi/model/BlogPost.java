package com.heizer.FrameworkDigitalBlogRestApi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "blog_post", schema = "blog")
public class BlogPost
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne(optional = false)
    @JoinColumn(name = "author", nullable = false, referencedColumnName = "id")
    private User author;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "post", referencedColumnName = "id")
    private List<PostComment> comments;

    @Transient
    private Integer commentCount;

    private Integer viewCount;

    private String category;

    private Date timestamp;

    public Long getId()
    {
        return id;
    }

    public String getTitle() {return title;}

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public User getAuthor()
    {
        return author;
    }

    public void setAuthor(User author) {this.author = author;}

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public List<PostComment> getComments() {return comments;}

    public void setComments(List<PostComment> comments) {this.comments = comments;}

    public Integer getCommentCount() {return comments.size();}

    public void setCommentCount(Integer commentCount) {this.commentCount = commentCount;}

    public Integer getViewCount() {return viewCount;}

    public void setViewCount(Integer viewCount) {this.viewCount = viewCount;}
}
