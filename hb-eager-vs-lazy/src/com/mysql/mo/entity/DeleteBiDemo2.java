package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteBiDemo2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Instructor.class)
				                     .addAnnotatedClass(InstructorDetail.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Bi Directional");

			session.beginTransaction();
			
			int theId  = 6;
			InstructorDetail tempInstructorDeatils = session.get(InstructorDetail.class, theId);
			
			tempInstructorDeatils.getInstructor().setInstructorDetail(null);
			
			if (tempInstructorDeatils != null) {
				session.delete(tempInstructorDeatils);
			} 
			
			session.getTransaction().commit();
			
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
