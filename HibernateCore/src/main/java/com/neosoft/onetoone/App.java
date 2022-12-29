package com.neosoft.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Employee emp=new Employee();
        emp.setId(101);
        emp.setName("akash");
        Laptop lap=new Laptop();
        lap.setId(1001);
        lap.setName("dell");
        lap.setEmployee(emp);
        emp.setLaptop(lap);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp);
        transaction.commit();
        session.close();
        sessionFactory.close();
        

	}

}
