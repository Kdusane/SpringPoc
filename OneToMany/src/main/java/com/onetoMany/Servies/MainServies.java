package com.onetoMany.Servies;

import com.onetoMany.CustomException.InvalidDetailsException;
import com.onetoMany.Entities.Customer;

public interface MainServies {
    Customer customerAdd(Customer customer);

}
