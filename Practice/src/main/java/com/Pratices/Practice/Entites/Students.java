package com.Pratices.Practice.Entites;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "PRACTICE")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sID;
    private String firstName;
    private String lastName;
    private int salary;

    @OneToMany(targetEntity = Courses.class,cascade = CascadeType.ALL)
    @JoinColumn(name="student_ids", referencedColumnName = "sID")
    private List<Courses> courses;


}
