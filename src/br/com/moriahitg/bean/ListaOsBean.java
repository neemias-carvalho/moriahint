package br.com.moriahitg.bean;

import br.com.moriahitg.dao.SZA990DAO;
import br.com.moriahitg.modelo.SZA990;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class ListaOsBean {

	List<SZA990> list = new ArrayList<SZA990>();

	@SuppressWarnings("unchecked")
	public String addOSNaListaPorCliente() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession session = request.getSession(true);
		String a1_cod = (String) session.getAttribute("A1_COD");
		SZA990DAO szadao = new SZA990DAO();
		list = szadao.getOSPorCliente(a1_cod);
		return "/listaDeOSs.xhtml?faces-redirect=true";
	}

	public List<SZA990> getList() {
		return list;
	}

	public void setList(List<SZA990> list) {
		this.list = list;
	}
}