package com.neosoft.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.neosoft.Student;

public class HqlExample {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        String hql="from Student";
//        String hql="from Student where rollNo=3";
//        String hql="from Student where name='ravi'";
//        String hql="from Student where name='ravi'";
//        String hql="from Student where name='ravi' and rollNo=2";
//        String hql="from Student where name='ravi' and rollNo=5";
//        String hql="from Student where name='ravi' or rollNo=3";
//        String hql="from Student where name='ravi' or rollNo=3";
//        String hql="from Student where name=:x and college=:y";
//        String hql="delete from Student where name=:x and college=:y";
//        String hql="update Student set name=:x where rollNo=:y";
//        Query query = session.createQuery(hql);
//        query.setParameter("x", "vijay");
//        query.setParameter("y", 5);
//        int noOfRows = query.executeUpdate();
//        System.out.println(noOfRows);
//        Student student =(Student) query.uniqueResult();
//        System.out.println(student);
//        List<Student> list = query.list(); 
//        for(Student s:list) {
//        	System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getCollege());
//        }
        String sql="select * from stud_table";
         SQLQuery query = session.createSQLQuery(sql);
        List<Object[]> list = query.list();
        for(Object[] arr:list) {
        	System.out.println(Arrays.deepToString(arr));
        }
        
        transaction.commit();
        session.close();
        sessionFactory.close();

	}

}
