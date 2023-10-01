package com.geekster.Test5.Repo;

import com.geekster.Test5.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
