package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDoctorRepo extends JpaRepository<Doctor, Long> {
}