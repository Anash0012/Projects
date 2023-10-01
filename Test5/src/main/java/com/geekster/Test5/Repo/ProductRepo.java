package com.geekster.Test5.Repo;

import com.geekster.Test5.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    List<Product> findByproductCategory(String category);
}
