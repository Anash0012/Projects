package com.geekster.Test5.Controller;

import com.geekster.Test5.Model.Address;
import com.geekster.Test5.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public void addaddress(@RequestBody Address address){
        addressService.addaddress(address);
    }

}