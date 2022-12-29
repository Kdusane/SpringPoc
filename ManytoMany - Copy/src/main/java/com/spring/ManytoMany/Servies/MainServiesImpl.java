package com.spring.ManytoMany.Servies;

import com.spring.ManytoMany.Entites.Course;
import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Repository.CourseRepo;
import com.spring.ManytoMany.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiesImpl implements MainEvent{
//    @Autowired
//    private StudentRepo studentRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;

    @Override
    public Student studentsave(Student student) {
       return studentRepo.save(student);
    }

    @Override
    public List<Course> courseSave(Course course) {
       return courseRepo.saveAll(Arrays.asList(course));

    }
}
