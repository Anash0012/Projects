package com.geekster.DoctorBooking.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AdminSignupOutput {
    private boolean signUpStatus;
    private String signUpStatusMessage;
}
