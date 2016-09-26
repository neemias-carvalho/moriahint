package br.com.moriahitg.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SZA990DAO {

	@SuppressWarnings("rawtypes")
	public List getOSPorCliente(String A1_COD, String dataDe, String dataAte, String tipoUm, String tipoDois,
			String tipoTres, String tipoQuatro, String tipoCinco, String tipoSeis, String func1, String func2, String func3,
			String func4, String func5, String func6, String func7, String func8, String func9, String func10,
			String func11, String func12, String func13, String func14, String func15, String func16, String func17,
			String func18, String func19, String func20, String func21, String func22, String func23, String func24,
			String func25, String func26, String func27, String func28, String func29, String func30) {
		Query query = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//Fazer um for aqui
			query = session.createQuery(
					"FROM SZA990 WHERE ZA_DTINI BETWEEN :dataDe AND :dataAte AND ZA_CLIENTE = :codigo AND (ZA_TIPO = :tipoUm OR ZA_TIPO = :tipoDois OR ZA_TIPO = :tipoTres OR ZA_TIPO = :tipoQuatro OR ZA_TIPO = :tipoCinco OR ZA_TIPO = :tipoSeis) AND (ZA_NOMFUNC = :func1 OR ZA_NOMFUNC = :func2 OR ZA_NOMFUNC = :func3 OR ZA_NOMFUNC = :func4 OR ZA_NOMFUNC = :func5 OR ZA_NOMFUNC = :func6 OR ZA_NOMFUNC = :func7 OR ZA_NOMFUNC = :func8 OR ZA_NOMFUNC = :func9 OR ZA_NOMFUNC = :func10 OR ZA_NOMFUNC = :func11 OR ZA_NOMFUNC = :func12 OR ZA_NOMFUNC = :func13 OR ZA_NOMFUNC = :func14 OR ZA_NOMFUNC = :func15 OR ZA_NOMFUNC = :func16 OR ZA_NOMFUNC = :func17 OR ZA_NOMFUNC = :func18 OR ZA_NOMFUNC = :func19 OR ZA_NOMFUNC = :func20 OR ZA_NOMFUNC = :func21 OR ZA_NOMFUNC = :func22 OR ZA_NOMFUNC = :func23 OR ZA_NOMFUNC = :func24 OR ZA_NOMFUNC = :func25 OR ZA_NOMFUNC = :func26 OR ZA_NOMFUNC = :func27 OR ZA_NOMFUNC = :func28 OR ZA_NOMFUNC = :func29 OR ZA_NOMFUNC = :func30) ORDER BY ZA_NOMFUNC"); //SELECT * FROM SZA990 WHERE ZA_DTINI BETWEEN '20140101' AND '20161231' AND ZA_CLIENTE = '000003' AND (ZA_TIPO = 'OUT' OR ZA_TIPO = '' OR ZA_TIPO = '' OR ZA_TIPO = 'CON' OR ZA_TIPO = 'ANL') AND (ZA_NOMFUNC = 'SILVANO DA SILVA ARAUJO' OR ZA_NOMFUNC = 'RENAN SOUSA DE ARAUJO' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '' OR ZA_NOMFUNC = '') ORDER BY ZA_CODFUN, ZA_DTINI
			query.setParameter("codigo", A1_COD).setParameter("dataDe", dataDe).setParameter("dataAte", dataAte)
					.setParameter("tipoUm", tipoUm).setParameter("tipoDois", tipoDois)
					.setParameter("tipoTres", tipoTres).setParameter("tipoQuatro", tipoQuatro)
					.setParameter("tipoCinco", tipoCinco).setParameter("tipoSeis", tipoSeis).setParameter("func1", func1).setParameter("func2", func2)
					.setParameter("func3", func3).setParameter("func4", func4).setParameter("func5", func5)
					.setParameter("func6", func6).setParameter("func7", func7).setParameter("func8", func8)
					.setParameter("func9", func9).setParameter("func10", func10).setParameter("func11", func11)
					.setParameter("func12", func12).setParameter("func13", func13).setParameter("func14", func14)
					.setParameter("func15", func15).setParameter("func16", func16).setParameter("func17", func17)
					.setParameter("func18", func18).setParameter("func19", func19).setParameter("func20", func20)
					.setParameter("func21", func21).setParameter("func22", func22).setParameter("func23", func23)
					.setParameter("func24", func24).setParameter("func25", func25).setParameter("func26", func26)
					.setParameter("func27", func27).setParameter("func28", func28).setParameter("func29", func29)
					.setParameter("func30", func30);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return query.list();
	}

}