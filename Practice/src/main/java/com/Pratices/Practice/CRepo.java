package com.Pratices.Practice;

import com.Pratices.Practice.Entites.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRepo extends JpaRepository<Courses,Integer> {
}
