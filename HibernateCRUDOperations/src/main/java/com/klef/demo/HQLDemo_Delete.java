package com.klef.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo_Delete {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sfg=cfg.buildSessionFactory();
		 Session session=sfg.openSession();

		 //1st way
		/*Query qry1=session.createQuery("delete from Student where id='104'");
		int n1=qry1.executeUpdate();
		System.out.println(n1+" Object(s) deleted");*/



		//2nd way
		 /*
		 Query qry2=session.createQuery("delete from Student where id=?");
		qry2.setInteger(0,103);
		int n1=qry2.executeUpdate();
		System.out.println(n1+" Object(s) deleted");
		*/



		 //3rd way
		 Query qry3=session.createQuery("delete from Student where id=:val");
			qry3.setParameter("val", 190030098);
			int n1=qry3.executeUpdate();
			System.out.println(n1+" Object(s) deleted");
		Transaction txt=session.beginTransaction();
		txt.commit();
		session.close();
		sfg.close();
	}

}
