package com.spring.ManytoMany.Repository;

import com.spring.ManytoMany.Entites.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


    @Modifying
    @Transactional
    @Query(value="update students set student_name =:name WHERE sid=:id", nativeQuery = true)
    public int UpdateStudent(@Param("name") String name , @Param("id") int id);


    //jpql queries

}
