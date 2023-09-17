package com.Geekster.Test4.Service;

import com.Geekster.Test4.Model.Restaurant;
import com.Geekster.Test4.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepo restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepo restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant findById(Long id) {
        return restaurantRepository.findById(id);
    }

    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    public String save(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
        return "restraunt saved";
    }

    public String delete(Long id) {
        restaurantRepository.delete(id);
        return "Restaurant Deleted";
    }
}
