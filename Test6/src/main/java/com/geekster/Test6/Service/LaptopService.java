package com.geekster.Test6.Service;

import com.geekster.Test6.Model.Laptop;
import com.geekster.Test6.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    private final LaptopRepo laptopRepo;

    @Autowired
    public LaptopService(LaptopRepo laptopRep) {
        this.laptopRepo=laptopRep;
    }
    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepo.findById(id).orElse(null);
    }

    public Laptop createLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public void deleteLaptop(String id) {
        laptopRepo.deleteById(id);
    }
}
