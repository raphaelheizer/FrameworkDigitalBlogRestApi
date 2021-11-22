package com.heizer.FrameworkDigitalBlogRestApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "blog")
public class User
{
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
