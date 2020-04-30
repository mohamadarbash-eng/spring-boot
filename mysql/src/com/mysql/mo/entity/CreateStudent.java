package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CreateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Create");
			Student tempStudent = new Student("Mo", "Me", "mo@mo.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
