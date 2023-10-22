package com.Expense.Tracker.Controller;

import com.Expense.Tracker.Model.Dto.SignInInput;
import com.Expense.Tracker.Model.Dto.SignUpOutput;
import com.Expense.Tracker.Model.User;
import com.Expense.Tracker.Service.AuthenticationService;
import com.Expense.Tracker.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/register")
    public SignUpOutput registerUser(@Valid @RequestBody User user) {
        return userService.SignUpUser(user);
    }

    @PostMapping("/signin")
    public String signIn(@RequestBody @Valid SignInInput signInInput) {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("/signout")
    public String signOutUser(@RequestParam String email, @RequestParam String token) {
        if (authenticationService.authenticate(email, token)) {
            return userService.signOutUser(email);
        } else {
            return "Sign out not allowed for non-authenticated user.";
        }
    }

}
