package com.Pratices.Practice.Controller;


import com.Pratices.Practice.Entites.Courses;
import com.Pratices.Practice.Entites.Students;

import com.Pratices.Practice.Repository;
import com.Pratices.Practice.Servies.Servies;
import com.Pratices.Practice.deo.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repository;
    @Autowired
    private Servies servies;

    @GetMapping("/users")
    public Students toController (){
        Courses course = new Courses();
        course.setCourseName("java");
        course.setCoursePrice("23000");
         Students students =  new Students();
         students.setFirstName("kunal");
         students.setSalary(23000);
         students.setLastName("dusane");
         students.getCourses().add(course);
        return servies.CreateEntities(students);
    }
}
