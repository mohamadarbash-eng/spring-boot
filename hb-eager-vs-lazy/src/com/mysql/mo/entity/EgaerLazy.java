package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class EgaerLazy {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Instructor.class)
				                     .addAnnotatedClass(InstructorDetail.class)
				                     .addAnnotatedClass(Course.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Create Coures");

			session.beginTransaction();
			
			int tempId = 1;
			
			Instructor instructor = session.get(Instructor.class, tempId);
			
			System.out.println(instructor);
			
			System.out.println(instructor.getCourses());
			
			session.getTransaction().commit();
			
			session.close();
			
			
			System.out.println(instructor.getCourses());
			
		
			
		  }
		finally {
			session.close();
			factory.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
