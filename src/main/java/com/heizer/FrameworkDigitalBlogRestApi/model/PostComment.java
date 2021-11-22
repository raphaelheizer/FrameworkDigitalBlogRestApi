package com.heizer.FrameworkDigitalBlogRestApi.model;

import javax.persistence.*;

@Entity
@Table(name = "post_comment", schema = "blog")
public class PostComment
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user", nullable = false, referencedColumnName = "id")
    private User user;

    private String content;

    public Long getId() {return id;}

    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}
}
