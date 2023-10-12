package com.example.RestaurantManagement.Repo;

import com.example.RestaurantManagement.Model.FoodItem;
import com.example.RestaurantManagement.Model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitorEntity extends JpaRepository<Visitor,Long> {
}