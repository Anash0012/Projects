package com.geekster.Test6.Repo;

import com.geekster.Test6.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,String> {
}
