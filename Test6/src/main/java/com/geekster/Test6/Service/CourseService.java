package com.geekster.Test6.Service;

import com.geekster.Test6.Model.Course;
import com.geekster.Test6.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourseById(String id) {
        return courseRepo.findById(id).orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);

    }
}
