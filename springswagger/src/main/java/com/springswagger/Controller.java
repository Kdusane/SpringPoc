package com.springswagger;

import com.springswagger.Entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
public class Controller {
    ConcurrentMap<Integer , User> userConcurrentMap = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public User getUser(@PathVariable int  id ){
        return userConcurrentMap.get(id);


    }
    @GetMapping("/alluser")
    public List<User> getAllUser(){
       // List<User> userList = new ArrayList<>();
        return new ArrayList<>(userConcurrentMap.values());
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userConcurrentMap.put(user.getId(),user);
    }

}
