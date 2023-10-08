package com.geekster.Test6.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private String CourseID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList;
}
