package com.example.Hotel_Management.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OYO")
public class Room {

    @Id
    @NonNull
    private Integer roomId;
    private Integer roomNumber;
    private Type roomType;
    @NotNull
    private double roomPrice;
    @Column(name = "Available")
    private boolean roomAvailable;
}















