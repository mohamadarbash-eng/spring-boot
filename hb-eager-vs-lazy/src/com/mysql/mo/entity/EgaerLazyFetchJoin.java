package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class EgaerLazyFetchJoin {

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
			
			
			Query<Instructor> query = session.createQuery("select i from Instructor i "
					+ "JOIN FETCH i.courses "
					+ "where i.id=:theInstructorId",
					Instructor.class);
			
			query.setParameter("theInstructorId", tempId);
			
			Instructor instructor = query.getSingleResult();
			
			System.out.println(instructor);
			
			
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
