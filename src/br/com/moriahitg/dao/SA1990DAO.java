package br.com.moriahitg.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.moriahitg.modelo.SA1990;

public class SA1990DAO {
	
	public SA1990 getCliente(String A1_COD, String A1_CGC) {
		SA1990 sa1 = new SA1990();
		sa1.setA1_COD("nada");
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("FROM SA1990 WHERE A1_COD = :codigo and A1_CGC = :cnpj");
			query.setParameter("codigo", A1_COD).setParameter("cnpj", A1_CGC);
			if (query.list().size() != 0) {
				sa1 = (SA1990) query.list().get(0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
			return sa1;
	}
}