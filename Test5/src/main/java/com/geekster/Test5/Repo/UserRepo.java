package com.geekster.Test5.Repo;


import com.geekster.Test5.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    User findUserById(Integer id);
}
