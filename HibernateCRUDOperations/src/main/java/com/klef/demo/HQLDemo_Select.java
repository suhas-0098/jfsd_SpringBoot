package com.klef.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sfg=cfg.buildSessionFactory();
		 Session session=sfg.openSession();



		//1st way
		 /*Query qry=session.createQuery("from Student");
		 List<Student> li=qry.list();
		 System.out.println("total records "+li.size());
		 int n1=1;
		 for(Student s:li)
		 {   System.out.println("student record "+n1);
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getDepartment()+" "+s.getAge()+" "+s.getGender());
			 n1++;
		 }*/




		 //2nd way
		 /*Query qry2=session.createQuery("from Student where id=101");
		 List<Student> li2=qry2.list();
		 System.out.println("total records "+li2.size());
		 int n1=1;
		 for(Student s:li2)
		 {   System.out.println("student record "+n1);
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getDepartment()+" "+s.getAge()+" "+s.getGender());
			 n1++;
		 }*/


		 
		 //3rd way
		 Query qry2=session.createQuery("from Student where id=?");
		 qry2.setInteger(0, 102);
		 List<Student> li2=qry2.list();
		 System.out.println("total records "+li2.size());
		 int n1=1;
		 for(Student s:li2)
		 {   System.out.println("student record "+n1);
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getDepartment()+" "+s.getAge()+" "+s.getGender());
			 n1++;
		 }
		Transaction txt=session.beginTransaction();
		txt.commit();
		session.close();
		sfg.close();

	}

}
