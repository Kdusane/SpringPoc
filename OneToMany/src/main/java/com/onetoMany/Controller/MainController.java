package com.onetoMany.Controller;

import com.onetoMany.CustomException.InvalidDetailsException;
import com.onetoMany.Entities.Customer;
import com.onetoMany.Repository.CustomerRepo;
import com.onetoMany.Repository.ProductRepo;
import com.onetoMany.Servies.MainServies;
import com.onetoMany.Servies.ServiesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Transactional
public class MainController {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ServiesImpl mainServies;
    @Autowired
    private ProductRepo productRepo;


    @PostMapping("/addcustomer")
    public Customer custoadd(@RequestBody Customer customer)  {

        return mainServies.customerAdd(customer);

    }


    @DeleteMapping("deleteproduct/{id}")
     @CacheEvict(cacheNames = "Product", key = "#id")  //only applicable for void methods because this acts as trigger
    public void deleteproductbyid(@PathVariable int id){
        System.out.println("into the database");
        productRepo.deleteById(id);
    }

    // by using request param

    @GetMapping("/findbyname")
    @Cacheable(cacheNames = "Customer" , key = "#ixd") // this require return type methods
    public Customer findbyname( @RequestParam String name){
        System.out.println("from database");
        return customerRepo.findByCustomerName(name);
    }

    // difference between cacheable and cache put
    // cacheput run the method put the resut into cache
    // while cacheable skip the execution of method


    @GetMapping("/findbynameandmail")
    // as this is used to give an own reponse entity
    public ResponseEntity <Customer> findbynameandmail(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerRepo.findByCustomerNameAndCustEmailid(customer.getCustomerName(),
                customer.getCustEmailid()), HttpStatus.OK);
    }

    @GetMapping("/sortedCustomer")
    @Transactional
    public List<Customer> findallbysorted() throws InvalidDetailsException{
        if(customerRepo.findallsortedbyname()!= null){
            throw new InvalidDetailsException("list is  not null");
        }
        return customerRepo.findallsortedbyname();
    }
}

// get : return null is object not found
// load : return object not found exception
//




