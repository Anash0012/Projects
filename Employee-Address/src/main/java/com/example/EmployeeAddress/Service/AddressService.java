package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String addAddresses(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return "Addresses saved Successfully";
    }

    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String updateAddressById(Long id, String city) {
        Optional<Address> addressOptional=addressRepo.findById(id);
        Address address=addressOptional.get();
        if (address==null){
            return "Invalid Id";
        }
        address.setCity(city);
        addressRepo.save(address);
        return "Address updated Successfully";
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted";
    }
}
