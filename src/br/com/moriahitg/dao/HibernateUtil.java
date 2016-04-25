package br.com.moriahitg.dao;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import org.apache.log4j.BasicConfigurator;


public class HibernateUtil {
	public static final SessionFactory sessionfactory = buildSessionFactory();
	
	@SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactory() {
		BasicConfigurator.configure();
		
		try {
			return new Configuration().configure("br/com/moriahitg/config/hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex); 
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() { 
		return sessionfactory; 
	}
}