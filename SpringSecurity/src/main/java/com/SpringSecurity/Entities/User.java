package com.SpringSecurity.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "Users")
@ToString
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String userPass;
    private String usermailID;

//    @OneToMany(targetEntity = Role.class, fetch = FetchType.EAGER)
//@JoinTable(name = "User_Role" ,joinColumns =@JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
//    private List<Role> roles;

}
