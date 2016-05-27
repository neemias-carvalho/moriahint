package br.com.moriahitg.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.moriahitg.dao.SA1990DAO;
import br.com.moriahitg.modelo.SA1990;
import br.com.moriahitg.Pattern.PadraoDeCampos;

@ManagedBean
@SessionScoped
public class LoginBean {
	/**
	 * 
	 */
	String A1_COD, A1_CGC, A1_CGCcomPontosEBarras, resultado;
	PadraoDeCampos pdc = new PadraoDeCampos();
	SA1990DAO sa1dao = new SA1990DAO();
	SA1990 sa1 = new SA1990();
	

	public String logar() {
		A1_CGC = A1_CGCcomPontosEBarras.replaceAll("[-/.]", "");
		resultado = "";
		sa1 = sa1dao.getCliente(A1_COD, A1_CGC);
		if (sa1.getA1_COD().equals(A1_COD) && sa1.getA1_CGC().equals(A1_CGC)) {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
			session.setAttribute("A1_COD", sa1.getA1_COD());
			return "/recursos.xhtml?faces-redirect=true";
		} else if (!pdc.formatoCorretoA1_COD(A1_COD)) {
			resultado = "O campo de código deve possuir 6 números";
		} else if (A1_CGC.isEmpty() || A1_COD.isEmpty()) {
			resultado = "Preencha os espaços para se conectar";
		} else if (sa1.getA1_COD().equals("nada")) {
			resultado = "Login inválido";
		}
		return resultado;
	}

	public String deslogar() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return "/login.xhtml?faces-redirect=true";
	}

	public String getA1_COD() {
		return A1_COD;
	}

	public void setA1_COD(String a1_COD) {
		A1_COD = a1_COD;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getA1_CGC() {
		return A1_CGC;
	}

	public void setA1_CGC(String a1_CGC) {
		A1_CGC = a1_CGC;
	}

	public String getA1_CGCcomPontosEBarras() {
		return A1_CGCcomPontosEBarras;
	}

	public void setA1_CGCcomPontosEBarras(String a1_CGCcomPontosEBarras) {
		A1_CGCcomPontosEBarras = a1_CGCcomPontosEBarras;
	}
}