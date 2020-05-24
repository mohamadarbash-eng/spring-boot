package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CreateCourseAndReview {

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
			
			Course tempCourse = new Course(" Hey  therefdfdf!");
			
			tempCourse.addReview(new Reviews("you'r good person"));
			tempCourse.addReview(new Reviews("you'r good person"));
			tempCourse.addReview(new Reviews("you'r good person :)"));
	
			
			session.save(tempCourse);
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
