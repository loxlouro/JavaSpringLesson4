package com.example.JavaSpringLesson4.repo;


import com.example.JavaSpringLesson4.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
