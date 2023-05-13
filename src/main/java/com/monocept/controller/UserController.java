package com.monocept.controller;

import com.monocept.dto.User;
import com.monocept.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-user")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id)
    {
        return userService.getUserById(id);
    }

}
