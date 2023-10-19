package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.Admins;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAdminRepo extends JpaRepository<Admins, Long> {
}