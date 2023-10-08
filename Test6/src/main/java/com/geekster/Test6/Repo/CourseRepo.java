package com.geekster.Test6.Repo;

import com.geekster.Test6.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
}
