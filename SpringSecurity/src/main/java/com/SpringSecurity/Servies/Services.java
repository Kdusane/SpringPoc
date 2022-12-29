package com.SpringSecurity.Servies;

import com.SpringSecurity.Entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Services{

    List<User> userArrayList = new ArrayList<>();

    public void UserServices(){

         userArrayList.add( new User(1, "kdusane","kunal123","kunal@gmail.com"));
       userArrayList.add(  new User(2, "rOwal","rohit123","rohit@gmail.com"));
        userArrayList.add( new User(3, "Lchaudhari","lokesh123","lokesh@gmail.com"));
        userArrayList.add( new User(4, "sParulekar","siddesh123","siddesh@gmail.com"));
        userArrayList.stream().forEach(System.out::println);

    }
    public List<User> getalluser(){
        return userArrayList;
    }

    public void getbyusermailid(String usermailid){
        userArrayList.stream().filter((user)->user.getUsermailID().equals(usermailid)).map(user -> user.getUsermailID()).findAny().get();
    }
}
