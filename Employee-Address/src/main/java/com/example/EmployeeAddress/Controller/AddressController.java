package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody List<Address> addresses){
        return addressService.addAddresses(addresses);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("address/id/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PutMapping("address/id/{id}/city/{city}")
    public String updateAddressById(@PathVariable Long id,@PathVariable String city){
        return addressService.updateAddressById(id,city);
    }

    @DeleteMapping("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

}
