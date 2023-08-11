package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Project Started.." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        Emp student=new Emp();
        student.setId(101);
        student.setName("Sufiyan");
        student.setAddress("Baghnagar");
       session.save(student);
        transaction.commit();
        session.close();
    }
}
