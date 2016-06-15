package br.com.moriahitg.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class AA1990DAO {
	@SuppressWarnings("rawtypes")
	public List getFuncionarios () {
		Query query = null;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("SELECT AA1_NOMTEC FROM AA1990");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return query.list();
	}
}
