package com.geekster.Test5.Service;

import com.geekster.Test5.Model.Product;
import com.geekster.Test5.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo  productRepo;
    public void addproduct(Product product) {
        productRepo.save(product);
    }
    public List<Product> getallProducts() {
        return productRepo.findAll();
    }
    public List<Product> getproductsbycategory(String category) {
        return productRepo.findByproductCategory(category);
    }
    public void deletebyid(Integer id) {
        productRepo.deleteById(id);
    }
}