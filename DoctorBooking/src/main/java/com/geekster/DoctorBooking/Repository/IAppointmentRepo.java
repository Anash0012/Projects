package com.geekster.DoctorBooking.Repository;

import com.geekster.DoctorBooking.Model.Appointment;
import com.geekster.DoctorBooking.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAppointmentRepo extends JpaRepository<Appointment, Long> {
    Appointment findFirstByPatient(Patient patient);
}