package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Long> {
}
