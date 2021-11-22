package com.heizer.FrameworkDigitalBlogRestApi.controllers;

import com.heizer.FrameworkDigitalBlogRestApi.model.User;
import com.heizer.FrameworkDigitalBlogRestApi.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/users")
@Controller
public class UserController
{
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
}
