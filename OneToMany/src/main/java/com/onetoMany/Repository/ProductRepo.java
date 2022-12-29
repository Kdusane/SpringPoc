package com.onetoMany.Repository;

import com.onetoMany.Entities.Product;
//import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    void deleteById(int id);

    @Modifying
    @Transactional
    // if not given transactional then we cant roleback


    @Query(value = "delete p from product p where p.pid=:id", nativeQuery = true)
    public void deletefromproductbyid(@Param("id") int cid);
}
