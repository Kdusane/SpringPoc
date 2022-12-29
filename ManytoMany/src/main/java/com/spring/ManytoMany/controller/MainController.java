package com.spring.ManytoMany.controller;

import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Repository.StudentRepo;
import com.spring.ManytoMany.Servies.MainServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    MainServiesImpl mainServies;
    @Autowired
    StudentRepo studentRepo;



    @PostMapping("/adduser")
    public Student toChange(@RequestBody Student student){
       return mainServies.studentsave(student);
    }
//    @GetMapping("/showuser")
//    public List<Student> toChange(){
//        List<Student> students =studentRepo.findAllbyStudentName("kunal");
//        students.forEach(System.out::println);
//        return students;
//    }
    @GetMapping("/getstudent/{id}")
    public Student toget(@PathVariable int id){
         return mainServies.getstudents(id).get();

    }

    @PutMapping("/updateStudent/{id}/{name}")
   @CachePut(cacheNames = "Student" , key  ="#id")
    public void updateStudent(@PathVariable int id , @PathVariable String name){
        studentRepo.UpdateStudent(name, id);
    }



}
