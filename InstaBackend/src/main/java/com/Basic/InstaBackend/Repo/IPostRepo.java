package com.Basic.InstaBackend.Repo;

import com.Basic.InstaBackend.Model.Post;
import com.Basic.InstaBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {


    List<Post> findByUser(User user);
}