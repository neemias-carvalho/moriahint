package br.com.moriahitg.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.moriahitg.dao.SA1990DAO;
import br.com.moriahitg.modelo.SA1990;

public class TesteSA1990DAO {

	@Test
	public void testGetEmpresa() {
		SA1990DAO sa1dao = new SA1990DAO();
		SA1990 sa1 = null;
		sa1 = sa1dao.getCliente("000001");
		assertEquals(sa1.getA1_NOME(), "CHRISTOPHER VASCONCELOS                 ");
		sa1 = sa1dao.getCliente("000002");
		assertEquals(sa1.getA1_NOME(), "NEEMIAS BOY DOIDO                       ");
	}
}