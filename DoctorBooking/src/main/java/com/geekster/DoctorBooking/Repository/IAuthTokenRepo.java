package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.AuthenticationToken;
import com.geekster.DoctorBooking.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByPatient(Patient patient);
}