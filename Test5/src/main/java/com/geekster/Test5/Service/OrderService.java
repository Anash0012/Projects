package com.geekster.Test5.Service;

import com.geekster.Test5.Model.Order;
import com.geekster.Test5.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public void addOrder(Order orderEntity) {
        orderRepo.save(orderEntity);
    }

    public Optional<Order> getorderbyid(Integer id) {
        return orderRepo.findById(id);
    }
}