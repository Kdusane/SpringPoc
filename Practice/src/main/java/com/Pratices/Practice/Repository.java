package com.Pratices.Practice;

import com.Pratices.Practice.Entites.Students;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Students, Integer> {
}
