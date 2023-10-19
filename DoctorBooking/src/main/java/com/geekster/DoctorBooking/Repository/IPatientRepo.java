package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPatientRepo extends JpaRepository<Patient, Long> {
    Patient findFirstByPatientEmail(String newEmail);
}
