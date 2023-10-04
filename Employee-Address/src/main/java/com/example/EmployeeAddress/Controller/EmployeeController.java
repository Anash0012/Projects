package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("Employee")
    public List<Employee> getAllEmployee(@RequestBody List<Employee> employeeList){
        return employeeService.getAllEmployee(employeeList);
    }

    @GetMapping("Employee/id/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("employees")
    public String addEmployees(@RequestBody List<Employee> employeeList){
        return employeeService.addEmployees(employeeList);
    }

    @PutMapping("employee/id/{id}/address/{address}")
    public String updateEmployeeById(@PathVariable Long id, @PathVariable Address address){
        return employeeService.updateEmployeeById(id,address);
    }

    @DeleteMapping("employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
