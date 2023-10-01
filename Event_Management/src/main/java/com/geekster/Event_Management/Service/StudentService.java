package com.geekster.Event_Management.Service;

import com.geekster.Event_Management.Model.Department;
import com.geekster.Event_Management.Model.Student;
import com.geekster.Event_Management.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student added successfully!";
    }

    public String updateStudentDepartment(Long id, Department department) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setDepartment(department);
            studentRepo.save(student);
            return "Student department updated successfully!";
        } else {
            return "Student not found!";
        }
    }

    public String deleteStudent(Long id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return "Student deleted successfully!";
        } else {
            return "Student not found!";
        }
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return (Student) studentRepo.findById(id).orElse(null);
    }
}