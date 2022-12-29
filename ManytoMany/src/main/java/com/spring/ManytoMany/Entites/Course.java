package com.spring.ManytoMany.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cID;
    private String cName;
    private String subjectName;


    @ManyToMany(mappedBy = "courseList" , fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    @JsonIgnore
    List<Student> studentList = new ArrayList<>();



//    public Course(int cID, String cName, String subjectName) {
//        this.cID = cID;
//        this.cName = cName;
//        this.subjectName = subjectName;
//    }
}
