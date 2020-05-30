package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Demo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Instructor.class)
				                     .addAnnotatedClass(InstructorDetail.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Create");
			Instructor tempInstructor = new Instructor("Mo", "Montag", "mo@mo.mo");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("Mo", "Montag");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
		}

}
