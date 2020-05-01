package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DeleteStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Delete");
			int studentId = 1;
			
			session.beginTransaction();	
			
			//Student tempStudent = session.get(Student.class, studentId);

			//session.delete(tempStudent);
			
			
			//session.getTransaction().commit();
			
			
			System.out.println("delete");
			session.createQuery("delete from Student where id=2").executeUpdate();
			session.getTransaction().commit();
			
			
			
			
		}
		finally {
			factory.close();
		}		
	}

}
