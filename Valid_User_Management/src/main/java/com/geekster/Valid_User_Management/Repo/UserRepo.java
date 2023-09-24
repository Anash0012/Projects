package com.geekster.Valid_User_Management.Repo;

import com.geekster.Valid_User_Management.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
}
