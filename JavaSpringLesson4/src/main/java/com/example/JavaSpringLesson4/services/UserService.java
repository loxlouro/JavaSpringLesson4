package com.example.JavaSpringLesson4.services;


import com.example.JavaSpringLesson4.models.User;
import com.example.JavaSpringLesson4.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String saveUser(User user){
        try{
            User userFromDB = userRepository.findByEmail(user.getEmail());
            if (userFromDB!=null) throw new RuntimeException("User already exists");
            userRepository.save(user);
            return "User saved successfully";
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }
    public String deleteUser(User user){
        try{
            User userFromDB = userRepository.findByEmail(user.getEmail());
            if (userFromDB==null) throw new RuntimeException("User not found");
            userRepository.delete(userFromDB);
            return "User deleted successfully";
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }
    public User findByEmail(String email){
        try{
            User userFromDB = userRepository.findByEmail(email);
            if (userFromDB==null) throw new RuntimeException("User not found");
            return userFromDB;
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public Collection<User> getAllUsers(){
        try{
            Collection<User> users = userRepository.findAll();
            return users;
        } catch (Exception e){
            return null;
        }
    }
}
