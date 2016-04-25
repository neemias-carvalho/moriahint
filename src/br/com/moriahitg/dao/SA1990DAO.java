package br.com.moriahitg.dao;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.moriahitg.modelo.SA1990;

public class SA1990DAO {
	
	@SuppressWarnings("rawtypes")
	public SA1990 getCliente(String A1_COD) {
		SA1990 sa1 = new SA1990();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("FROM SA1990 WHERE A1_COD = :codigo ");
			query.setParameter("codigo", A1_COD);
			Iterator it = query.iterate();
			sa1 = (SA1990) it.next();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
			return sa1;
	}
}