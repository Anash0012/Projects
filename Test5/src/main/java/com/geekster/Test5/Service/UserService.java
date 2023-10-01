package com.geekster.Test5.Service;

import com.geekster.Test5.Model.User;
import com.geekster.Test5.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public void addUser(User user) {
        userRepo.save(user);
    }

    public User getuserById(Integer id) {
        return  userRepo.findUserById(id);
    }
}
