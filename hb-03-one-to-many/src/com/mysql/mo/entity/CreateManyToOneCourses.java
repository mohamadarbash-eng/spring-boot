package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CreateManyToOneCourses {

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
			
			Course tempCourse1 = new Course("Air Guitar The Ultimate Guide");
			Course tempCourse2 = new Course("Air Guita The Ultimate Guide 2");
			
			instructor.add(tempCourse1);
			instructor.add(tempCourse2);
			
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
