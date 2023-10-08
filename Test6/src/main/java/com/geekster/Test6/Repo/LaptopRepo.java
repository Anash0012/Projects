package com.geekster.Test6.Repo;

import com.geekster.Test6.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,String> {
}
