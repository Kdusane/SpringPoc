package com.onetoMany.Servies;

import com.onetoMany.CustomException.InvalidDetailsException;
import com.onetoMany.Entities.Customer;
import com.onetoMany.Repository.CustomerRepo;
//import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ServiesImpl implements MainServies{
    @Autowired
    private CustomerRepo customerRepo;

    @Override
//    @Transactional
    public Customer customerAdd(Customer customer)  {
        return customerRepo.save(customer);

    }



}
