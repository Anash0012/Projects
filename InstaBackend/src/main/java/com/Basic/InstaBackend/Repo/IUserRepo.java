package com.Basic.InstaBackend.Repo;

import com.Basic.InstaBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {


    User findFirstByEmail(String email);
}
