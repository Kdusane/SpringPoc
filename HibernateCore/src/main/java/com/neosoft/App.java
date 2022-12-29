package com.neosoft;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student=new Student("manoj","birla");
        session.save(student);
//        System.out.println("------------------------------------");
//        Student student1 = (Student) session.get(Student.class, 2);
//        System.out.println(student1);      
//        System.out.println("------------------------------------");
//        Query query = session.createQuery("from Student");
//        List<Student> list = query.list();
//        for(Student s:list) {
//        	System.out.println(s);
//        }
//        System.out.println("------------------------------------");
//        Student student = (Student)session.get(Student.class, 2);
//        session.delete(student);
//        Student student2 = (Student)session.get(Student.class, 1);
//        student2.setCollege("Sonawne");
//        student2.setName("yash");
//        session.update(student2);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
