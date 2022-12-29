package com.dependancyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class DependancyInjectionApplication {

	public static void main(String[] args) {

		 ConfigurableApplicationContext context =SpringApplication.run(DependancyInjectionApplication.class, args);
		 Employee e = context.getBean(Employee.class);
		 e.toDisplay();
	}

}
