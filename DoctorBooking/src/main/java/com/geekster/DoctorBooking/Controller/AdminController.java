package com.geekster.DoctorBooking.Controller;

import com.geekster.DoctorBooking.Model.Appointment;
import com.geekster.DoctorBooking.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AppointmentService appointmentService;


    @GetMapping("appointments")
    List<Appointment> getAllAppointments()
    {
        return appointmentService.getAllAppointments();
    }

}