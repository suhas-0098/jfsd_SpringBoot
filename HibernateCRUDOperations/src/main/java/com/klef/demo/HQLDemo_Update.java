package com.klef.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sfg=cfg.buildSessionFactory();
		 Session session=sfg.openSession();

		 //1st wat
		/*Query qry1=session.createQuery("update Student set name='hii2',gender='male' where id=104");
		int n1=qry1.executeUpdate();
		System.out.println(n1+" record updated");*/



		 //2nd way
		 /*Query qry2=session.createQuery("update Student set name=?,department=? where id=?");
		 qry2.setString(0,"queeen");
		 qry2.setString(1,"cse");
		 qry2.setInteger(2, 102);
		 int n2=qry2.executeUpdate();*/

		 
		 //way 3
		 Query qry3=session.createQuery("update Student set age=:v1,department=:v2 where id=:v3");
		 qry3.setParameter("v1",20.2);
		 qry3.setParameter("v2","cse");
		 qry3.setParameter("v3",101);
		 int n3=qry3.executeUpdate();
		System.out.println(n3+" record updated");
		Transaction txt=session.beginTransaction();
		txt.commit();
		session.close();
		sfg.close();
	}

}
