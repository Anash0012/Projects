package com.geekster.Valid_User_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @NonNull
    @Size(min = 3,max = 20)
    private String UserName;

    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in the format yyyy-MM-dd")
    private String DateOfBirth;

    @NonNull
    @Email(message = "Invalid email format")
    private String Email;

    @NotNull
    @Pattern(regexp = "\\d{2}-\\d{10}", message = "Phone number should be in the format XX-XXXXXXXXXX ")
    private String PhoneNumber;
}
