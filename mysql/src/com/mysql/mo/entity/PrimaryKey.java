package com.mysql.mo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKey {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
				                     
		try {
			System.out.println("Create");
			Student tempStudent1 = new Student("Mo1", "Me1", "mo@mo.com");
			Student tempStudent2 = new Student("Mo2", "Me2", "mo@mo.com");
			Student tempStudent3 = new Student("Mo3", "Me3", "mo@mo.com");
			session.beginTransaction();
			
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
		

	}

}
