package com.klef.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientController {

	public static void main(String[] args) {
		/*Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Student s=new Student();
		s.setId(190030098);
		s.setName("suhas");
		s.setDepartment("cse");
		s.setGender("Male");
		s.setAge(19);
		Transaction transaction=session.beginTransaction();
		session.save(s);
		System.out.println("Object saved");
		transaction.commit();
		session.close();
		sf.close();*/
		//insert
		/*Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Student s=new Student();
		s.setId(190031465);
		s.setName("tippu");
		s.setDepartment("cse");
		s.setGender("Male");
		s.setAge(20);
		Transaction transaction=session.beginTransaction();
		session.save(s);
		System.out.println("Object saved");
		transaction.commit();
		session.close();
		sf.close();*/
		//update
		/*
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Object obj=session.load(Student.class,new Integer(1900));
		Student s=(Student)obj;
		s.setName("KLU");
		s.setDepartment("ece");
		s.setGender("Male");
		Transaction transaction=session.beginTransaction();
		session.update(s);
		System.out.println("Object updated");
		transaction.commit();
		session.close();
		sf.close();*/
		
		//delete
		/*Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Object obj=session.load(Student.class,new Integer(1900));
		Student s=(Student)obj;
		Transaction transaction=session.beginTransaction();
		session.delete(s);
		System.out.println("Object deleted");
		transaction.commit();
		session.close();
		sf.close();*/
		
		//select
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Object obj=session.get(Student.class,new Integer(190030098));
		Student s=(Student)obj;
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getDepartment());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		session.close();
		sf.close();
		
		
	}

}
