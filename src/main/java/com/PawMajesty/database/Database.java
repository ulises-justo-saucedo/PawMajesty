package com.PawMajesty.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Database {
	private SessionFactory sessionFactory;
	public Database() {
		this.sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public Session openNewSession() {
		return sessionFactory.openSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
