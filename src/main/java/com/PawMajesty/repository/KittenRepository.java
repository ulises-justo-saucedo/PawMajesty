package com.PawMajesty.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.PawMajesty.database.Database;
import com.PawMajesty.entity.Kitten;

public class KittenRepository {
	@Autowired
	private Database database;
	public void save(Kitten kitten) {
		Session session = database.openNewSession();
		Transaction transaction = session.beginTransaction();
		session.save(kitten);
		transaction.commit();
		session.close();
	}
}
