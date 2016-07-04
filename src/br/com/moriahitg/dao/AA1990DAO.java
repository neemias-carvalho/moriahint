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
		query = session.createQuery("FROM AA1990 ORDER BY AA1_NOMTEC");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return query.list();
	}
}
