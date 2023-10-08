package com.geekster.Test6.Repo;

import com.geekster.Test6.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
}
