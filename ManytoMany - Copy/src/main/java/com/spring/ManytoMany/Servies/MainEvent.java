package com.spring.ManytoMany.Servies;

import com.spring.ManytoMany.Entites.Course;
import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainEvent {

   Student studentsave(Student student);
    List<Course> courseSave(Course course);




}
