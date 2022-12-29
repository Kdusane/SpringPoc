package com.spring.ManytoMany.controller;

import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Servies.MainServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    MainServiesImpl mainServies;



    @PostMapping("/adduser")
    public Student toChange(@RequestBody Student student){
       return mainServies.studentsave(student);



    }



}
