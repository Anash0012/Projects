package com.example.RestaurantManagement.Repo;

import com.example.RestaurantManagement.Model.Admin;
import com.example.RestaurantManagement.Model.AuthenticationToken;
import com.example.RestaurantManagement.Model.FoodItem;
import com.example.RestaurantManagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

    AuthenticationToken findFirstByAdmin(Admin admin);
}