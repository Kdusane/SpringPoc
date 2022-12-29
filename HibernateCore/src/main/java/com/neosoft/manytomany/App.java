package com.neosoft.manytomany;

import java.util.ArrayList;
import java.util.List;

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
        Emp emp1=new Emp();
        emp1.setId(123);
        emp1.setName("akash");
        Emp emp2=new Emp();
        emp2.setId(67);
        emp2.setName("yash");
        
        Project p1=new Project();
        p1.setId(73);
        p1.setName("java");
        
        Project p2=new Project();
        p2.setId(34);
        p2.setName("python");
        
        List<Emp> emps=new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        
        List<Project> projects=new ArrayList<>();
        projects.add(p1);
        projects.add(p2);
        emp1.setProjects(projects);
        p2.setEmps(emps);

        
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        transaction.commit();
        session.close();
        sessionFactory.close();

	}

}
