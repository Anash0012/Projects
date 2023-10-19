package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.AdminAuth;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAdminAuthRepo extends JpaRepository<AdminAuth, Long> {
}