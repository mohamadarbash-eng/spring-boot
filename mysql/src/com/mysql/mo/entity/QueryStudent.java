package com.mysql.mo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class QueryStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Query");
			
			session.beginTransaction();
			
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			
			displayStudent(theStudents);
			
			
			theStudents = session.createQuery("from Student s where s.lastName='Me3'").getResultList();
			
			
			displayStudent(theStudents);

			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
		
	
		
	}

	private static void displayStudent(List<Student> theStudents) {
		for (Student theTempStudent : theStudents) {
			System.out.println(theTempStudent);
		}
	}

}
