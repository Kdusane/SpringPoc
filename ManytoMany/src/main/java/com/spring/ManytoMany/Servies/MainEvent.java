package com.spring.ManytoMany.Servies;

import com.spring.ManytoMany.Entites.Course;
import com.spring.ManytoMany.Entites.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MainEvent {
    Student studentsave(Student student);
    //List<Course> courseSave(Course course);
    Optional<Student> getstudents(int id);








}
