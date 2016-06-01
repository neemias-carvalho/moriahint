package br.com.moriahitg.bean;

import br.com.moriahitg.Pattern.PadraoDeDatas;
import br.com.moriahitg.dao.SZA990DAO;
import br.com.moriahitg.modelo.SZA990;

import java.util.ArrayList;
import java.util.Date;
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
	Date dataDe, dataAte, hoje;
	PadraoDeDatas pdd = new PadraoDeDatas();
	
	@SuppressWarnings("unchecked")
	public String addOSNaListaPorCliente() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession session = request.getSession(true);
		String a1_cod = (String) session.getAttribute("A1_COD");
		SZA990DAO szadao = new SZA990DAO();
		list = szadao.getOSPorCliente(a1_cod, pdd.converterDeDataPrimefacesParaDataSQL(dataDe), pdd.converterDeDataPrimefacesParaDataSQL(dataAte));
		return "/listaDeOSs.xhtml?faces-redirect=true";
	}
	
	public List<SZA990> getList() {
		return list;
	}

	public void setList(List<SZA990> list) {
		this.list = list;
	}

	public Date getDataDe() {
		return dataDe;
	}

	public void setDataDe(Date dataDe) {
		this.dataDe = dataDe;
	}

	public Date getDataAte() {
		return dataAte;
	}

	public void setDataAte(Date dataAte) {
		this.dataAte = dataAte;
	}

	public Date getHoje() {
		hoje = new Date();
		return hoje;
	}

	public void setHoje(Date hoje) {
		this.hoje = hoje;
	}
}