package com.spring.ManytoMany.Repository;

import com.spring.ManytoMany.Entites.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {


}
