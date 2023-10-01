package com.geekster.Test5.Controller;

import com.geekster.Test5.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.geekster.Test5.Model.User;
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public void adduser(@RequestBody User user) {
        userService.addUser(user);
    }
    @GetMapping("user/{id}")
    public User getuser(@PathVariable Integer id){
        return userService.getuserById(id);
    }
}
