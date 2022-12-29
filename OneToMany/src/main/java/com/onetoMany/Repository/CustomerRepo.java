package com.onetoMany.Repository;

import com.onetoMany.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    public Customer findByCustomerName(String name);

    @Query(value = "SELECT * FROM customers  ORDER BY customer_name", nativeQuery = true)
    public List<Customer> findallsortedbyname();
    public Customer findByCustomerNameAndCustEmailid(String name, String mailid);

}
