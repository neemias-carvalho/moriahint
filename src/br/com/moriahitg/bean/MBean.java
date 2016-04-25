package br.com.moriahitg.bean;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.moriahitg.dao.SA1990DAO;
import br.com.moriahitg.dao.SZA990DAO;
import br.com.moriahitg.modelo.SA1990;
import br.com.moriahitg.modelo.SZA990;

@ManagedBean
@SessionScoped
public class MBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<SZA990> list = new ArrayList<SZA990>();
	SA1990DAO sa1dao = new SA1990DAO();
	SA1990 sa1 = new SA1990();
	String A1_COD;

	public String logar() {
		
		String resultado = "";
		sa1 = sa1dao.getCliente(A1_COD);
		if (sa1.getA1_COD().equals(A1_COD)) {
			resultado = "/recursos.xhtml?faces-redirect=true";
		} else {
			// resultado
		}
		return resultado;
	}

	@SuppressWarnings("unchecked")
	public String addOSNaListaPorCliente() {
		SZA990DAO szadao = new SZA990DAO();
		list = szadao.getOSPorCliente(sa1.getA1_COD()); // sa1.getA1_COD();
		return "/listaDeOSs.xhtml?faces-redirect=true";
	}

	public List<SZA990> getList() {
		return list;
	}

	public void setList(List<SZA990> list) {
		this.list = list;
	}

	public String getA1_COD() {
		return A1_COD;
	}

	public void setA1_COD(String a1_COD) {
		A1_COD = a1_COD;
	}
}