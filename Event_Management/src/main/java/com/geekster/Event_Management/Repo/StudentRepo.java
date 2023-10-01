package com.geekster.Event_Management.Repo;

import com.geekster.Event_Management.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
}
