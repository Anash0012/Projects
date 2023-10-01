package com.geekster.Test5.Service;

import com.geekster.Test5.Model.Address;
import com.geekster.Test5.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public void addaddress(Address address) {
        addressRepo.save(address);
    }


}