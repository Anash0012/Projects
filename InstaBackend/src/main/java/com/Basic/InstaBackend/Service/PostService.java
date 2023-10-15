package com.Basic.InstaBackend.Service;

import com.Basic.InstaBackend.Model.Post;
import com.Basic.InstaBackend.Model.User;
import com.Basic.InstaBackend.Repo.IPostRepo;
import com.Basic.InstaBackend.Repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    @Autowired
    ITokenRepo tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }

}