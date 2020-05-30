package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DeleteCourseAndReview3 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Instructor.class)
				                     .addAnnotatedClass(InstructorDetail.class)
				                     .addAnnotatedClass(Course.class)
				                     .addAnnotatedClass(Reviews.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Reviews");

			session.beginTransaction();
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);
			session.delete(tempCourse);
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
		
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
