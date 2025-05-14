package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(List<Employee> employeeList) {
        return (List<Employee>) employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
    
    public String addEmployees(List<Employee> employeeList) {
        employeeRepo.saveAll(employeeList);
        return "Employees added successfully"+employeeList;
    }

    public String updateEmployeeById(Long id, Address address) {
        Optional<Employee> employeeOptional=employeeRepo.findById(id);
        if (employeeOptional==null){
            return "Invalid EmployeeId";
        }
        Employee employee=employeeOptional.get();
        employee.setAddress(address);
        employeeRepo.save(employee);
        return "Address updated Successfully";
    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "Employee Removed successfully";
    }
}
