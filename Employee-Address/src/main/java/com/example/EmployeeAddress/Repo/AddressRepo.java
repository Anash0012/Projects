package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
