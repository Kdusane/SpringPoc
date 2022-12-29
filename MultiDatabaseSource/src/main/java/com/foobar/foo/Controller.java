package com.foobar.foo;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.repo.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private FooRepository fooRepository;

    @Autowired
    private BarRepository barRepository;

    @GetMapping("/getsql")
    public void gettheSql(){
        fooRepository.findAll();
    }

    @GetMapping("/getpostgre")
    public List<Bar> getPostGres(){

       List<Bar> bar =  barRepository.findAll();
       System.out.println(bar);
       return bar;
    }


    @PostMapping("/saveBar")
    public Bar postTheBar(@RequestBody Bar bar){
        return barRepository.save(bar);
    }
}
