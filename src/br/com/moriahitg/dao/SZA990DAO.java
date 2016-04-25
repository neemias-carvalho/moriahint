package br.com.moriahitg.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SZA990DAO {
	
	
	@SuppressWarnings("rawtypes")
	public List getOSPorCliente (String A1_COD) {
		Query query = null;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("FROM SZA990 WHERE ZA_CLIENTE = :codigo ");
		query.setParameter("codigo", A1_COD);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return query.list();
	}
}