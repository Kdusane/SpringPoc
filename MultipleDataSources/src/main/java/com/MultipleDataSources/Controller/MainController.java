package com.MultipleDataSources.Controller;

import com.MultipleDataSources.UserRepo.UserRepository;
import com.MultipleDataSources.bookrepo.BookRepository;
import com.MultipleDataSources.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MainController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/adduser")
    public void addUser(){
        userRepository.saveAll(Stream.of(new User(123,"kdusanne"), new User(345,"dkunal")).collect(Collectors.toList()));


    }
}
