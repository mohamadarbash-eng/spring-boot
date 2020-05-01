package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UpdateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Update");
			int studentId = 1;
			
			
			session.beginTransaction();	
			
			Student tempStudent = session.get(Student.class, studentId);

			tempStudent.setFirstName("scoopy");
			
			
			session.getTransaction().commit();
			System.out.println("update all");
			session = factory.getCurrentSession();
			session.beginTransaction();	
			
			session.createQuery("update Student set email='foo@gmail.com'")
			.executeUpdate();
			
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
