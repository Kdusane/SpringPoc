package com.spring.ManytoMany.Servies;

import com.spring.ManytoMany.Entites.Course;
import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Repository.CourseRepo;
import com.spring.ManytoMany.Repository.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor
public class MainServiesImpl implements MainEvent{
//    @Autowired
//    private StudentRepo studentRepo;

    // here we have done constructor injection

    // for setter injection till java 7  lambok
    // @Setter(onMethod = @__({Autowired}))
    // as this is not available after java 7

    private final StudentRepo studentRepo;
    // if you dont want to give final the we have to give @NonNull to that
    private final CourseRepo courseRepo;

    @Override
    public Student studentsave(Student student) {
       return studentRepo.save(student);
    }

//    @Override
//    public List<Course> courseSave(Course course) {
//       return courseRepo.saveAll(Arrays.asList(course));
//
//    }


    //geting ids

    @Override
    @Cacheable(cacheNames = "Student", key = "#id")
    public Optional< Student >  getstudents(int id) {
        if (studentRepo.findById(id).isPresent()){
            System.out.println("this is from database");
        }
        return studentRepo.findById(id);
    }
    public void deleteUser(@PathVariable int id){
        studentRepo.deleteById(id);
    }

}
