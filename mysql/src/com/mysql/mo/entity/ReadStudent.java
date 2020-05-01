package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ReadStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Read");
			Student tempStudent = new Student("Ubada", "bro", "mo@mo.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student student  = session.get(Student.class, tempStudent.getId());
			System.out.println(student);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
