package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Adhar a1=new Adhar();
        a1.setAdharId(101);
        a1.setAdharName("venky");
        a1.setAdharAddress("Solasa");
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(a1);
        tx.commit();
        session.close();
        System.out.println("Saved Successfully");
        }catch(Exception ex) {
        	System.out.println(ex);
        }
        
    }
        
   
}
