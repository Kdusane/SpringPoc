package com.spring.ManytoMany.Entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="Students")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sID;
    private String studentName;
    private String studentEmailid;
    private int rollNo;

    @ManyToMany(cascade=CascadeType.ALL)

    @JoinTable(name = "student_courses",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Course> courseList = new ArrayList<>();

//    public Student(int sID, String studentName, String studentEmailid, int rollNo) {
//        this.sID = sID;
//        this.studentName = studentName;
//        this.studentEmailid = studentEmailid;
//        this.rollNo = rollNo;
//    }
}
