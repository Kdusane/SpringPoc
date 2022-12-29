package com.SpringSecurity.MainController;

import com.SpringSecurity.Entities.User;

import com.SpringSecurity.Servies.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Services service;

    @GetMapping("useradd")
    public void addalluser(){
        service.UserServices();
    }
    @GetMapping("/getallusers")
    public List<User> getuserlist(){
        return service.getalluser();

    }
    @GetMapping("/getbymailid/{mailid}")
    public void getuserbymailid( @PathVariable String mailid){
        service.getbyusermailid(mailid);

    }



    }



