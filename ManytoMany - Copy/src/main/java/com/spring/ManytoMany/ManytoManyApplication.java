package com.spring.ManytoMany;

import com.spring.ManytoMany.Entites.Course;
import com.spring.ManytoMany.Entites.Student;
import com.spring.ManytoMany.Repository.CourseRepo;
import com.spring.ManytoMany.Repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ManytoManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytoManyApplication.class, args);
	}

	// using commandLineRunner
		// command line is an interface which has .run() method which accept string
//	@Bean
//	public CommandLineRunner mappingDemo(StudentRepo studentRepo, CourseRepo courseRepo){
//		return args->{
//			Student student = new Student(1,"kunal","kunal@Gmail.com",12);
//
//			studentRepo.save(student);
//
//			Course course = new Course(1, "java","development");
//			Course course1 = new Course(2, "python","data science");
//			Course course2 = new Course(1, "jetbins","devops");
//			courseRepo.saveAll(Arrays.asList(course,course1,course2));
//			student.getCourseList().add(course);
//
//			studentRepo.save(student);
//		};
//	}


}
