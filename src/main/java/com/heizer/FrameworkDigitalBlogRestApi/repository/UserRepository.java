package com.heizer.FrameworkDigitalBlogRestApi.repository;

import com.heizer.FrameworkDigitalBlogRestApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
}
