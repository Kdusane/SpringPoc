package com.neosoft.onetomany;

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
        
        Question q=new Question();
        q.setId(111);
        q.setQuestion("What is Java?");
        
        Answer ans1=new Answer();
        ans1.setId(368);
        ans1.setAnswer("It is a programming language");
        ans1.setQuestion(q);
        
        Answer ans2=new Answer();
        ans2.setId(18);
        ans2.setAnswer("It has many features");
        ans2.setQuestion(q);
        List<Answer> answers=new ArrayList<>();
        answers.add(ans1);
        answers.add(ans2);
        q.setAnswers(answers);

        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(q);
        
        transaction.commit();
        session.close();
        sessionFactory.close();

	}

}
