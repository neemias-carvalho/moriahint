package br.com.moriahitg.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.moriahitg.dao.SA1990DAO;
import br.com.moriahitg.dao.SZA990DAO;
import br.com.moriahitg.modelo.SA1990;
import br.com.moriahitg.modelo.SZA990;

import java.util.Iterator;
import java.util.List;

public class TesteSZA990DAO {
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testGetOsPorCliente() {
		SA1990DAO sa1dao = new SA1990DAO();
		SA1990 sa1 = new SA1990();
		sa1 = sa1dao.getCliente("000002");
		SZA990DAO szadao = new SZA990DAO();
		List list = szadao.getOSPorCliente(sa1.getA1_COD());
		Iterator it = list.iterator();
		SZA990 sza = (SZA990) it.next();
		assertEquals(sza.getZA_NOMCLI(), "NEEMIAS BOY DOIDO                                           ");
	}
}