package com.JPQL.JpqlQueries.controller;


import com.JPQL.JpqlQueries.Entities.Employees;
import com.JPQL.JpqlQueries.Repo.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    @Autowired
    private final Repository repository;

    @PostMapping("/addUser")
    public Employees employees(@RequestBody Employees employees){
        return repository.save(employees);
    }

    @GetMapping("/showUser")
    public String AllEmployees(){
       List<Employees> employees = repository.getAllUsersByName("kunal");
        employees.forEach(System.out::println);
        return null;
    }
}
