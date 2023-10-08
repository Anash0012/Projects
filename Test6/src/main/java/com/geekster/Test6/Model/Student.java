package com.geekster.Test6.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private String ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    private Address address;

    @OneToMany
    List<Course> courseList;
}
