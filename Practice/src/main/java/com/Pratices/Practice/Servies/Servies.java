package com.Pratices.Practice.Servies;


//import com.Pratices.Practice.Entites.Entities;
import com.Pratices.Practice.CRepo;
import com.Pratices.Practice.Entites.Courses;
import com.Pratices.Practice.Entites.Students;
import com.Pratices.Practice.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servies {

    @Autowired
    private Repository repository;

    @Autowired
    private CRepo repo;

    public Students CreateEntities(Students students){
        return repository.save(students);

    }
    public Courses CreateCourses(Courses courses){
        return repo.save(courses);
    }

}
