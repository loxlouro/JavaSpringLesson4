package com.example.JavaSpringLesson4.controllers;


import com.example.JavaSpringLesson4.models.User;
import com.example.JavaSpringLesson4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "/getAllUsers", method = RequestMethod.GET)
    public String  getAllUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }
}
