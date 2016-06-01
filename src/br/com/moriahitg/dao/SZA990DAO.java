package br.com.moriahitg.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SZA990DAO {
	
	
	@SuppressWarnings("rawtypes")
	public List getOSPorCliente (String A1_COD, String dataDe, String dataAte) {
		Query query = null;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("FROM SZA990 WHERE ZA_DTINI BETWEEN :dataDe AND :dataAte AND ZA_CLIENTE = :codigo ORDER BY ZA_CODFUN, ZA_DTINI");
		query.setParameter("codigo", A1_COD).setParameter("dataDe", dataDe).setParameter("dataAte", dataAte);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return query.list();
	}
}