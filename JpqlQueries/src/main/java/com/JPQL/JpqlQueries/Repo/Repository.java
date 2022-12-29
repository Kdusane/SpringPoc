package com.JPQL.JpqlQueries.Repo;

import com.JPQL.JpqlQueries.Entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Employees,Integer> {

//    @Query("SELECT u FROM Employees u ")
//    public List<Employees> getAllUusers();

//    @Query("SELECT   FROM Employees u where u.id=:id ")
//    public List<Employees> getAllUusers(@Param("id") Integer id);

//    @Query("SELECT first_name FROM emp u where u.id=:id ")
//    public List<Employees> getAllUusers(@Param("id") Integer id);

    // parameteric queries

    @Query("SELECT u FROM Employees u WHERE u.firstName=:n ")
    public List<Employees> getAllUsersByName(@Param("n") String name);


}
