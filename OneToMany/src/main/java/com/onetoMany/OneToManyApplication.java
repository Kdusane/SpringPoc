package com.onetoMany;

import com.onetoMany.CustomException.InvalidDetailsException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) throws InvalidDetailsException {

		SpringApplication.run(OneToManyApplication.class, args);
	}

}
