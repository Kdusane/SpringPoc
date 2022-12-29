package com.JPQL.JpqlQueries.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity(name = "acdf")
@Table(name ="employeeTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employees{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private  String firstName;
    private String lastName;
    private String city;
    private transient String hh;


}
