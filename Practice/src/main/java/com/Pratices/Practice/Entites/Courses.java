package com.Pratices.Practice.Entites;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String courseName;
    private String coursePrice;

//
//    @ManyToOne(fetch = FetchType.EAGER)
//    //@JoinColumn(name = "students_s_id")
//
//    private Students students;


}
