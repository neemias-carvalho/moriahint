package br.com.moriahitg.bean;

import br.com.moriahitg.Pattern.PadraoDeCampos;
import br.com.moriahitg.Pattern.PadraoDeDatas;
import br.com.moriahitg.Pattern.PadraoDeHoras;
import br.com.moriahitg.dao.AA1990DAO;
import br.com.moriahitg.dao.SZA990DAO;
import br.com.moriahitg.modelo.AA1990;
import br.com.moriahitg.modelo.AA1990AUX;
import br.com.moriahitg.modelo.SZA990;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class ListaOsBean {

	List<SZA990> listDeOSs = new ArrayList<SZA990>();
	List<AA1990> listDeFuncionarios = new ArrayList<AA1990>();
	List<AA1990AUX> listDeFuncionariosAux = new ArrayList<AA1990AUX>();
	String[] ordensSelecionadas, funcionariosSelecionados;
	String[] vetorAux1 = new String[6];
	String[] vetorAux2 = new String[30];
	Date dataDe, dataAte, hoje;
	PadraoDeDatas pdd = new PadraoDeDatas();
	PadraoDeCampos pdc = new PadraoDeCampos();
	PadraoDeHoras pdh = new PadraoDeHoras();

	@SuppressWarnings("unchecked")
	public String addOSNaListaPorCliente() {
		addTipoDeOS();
		addFuncionarios();
		FacesContext fc = FacesContext.getCurrentInstance();
		if (dataDe == null || dataAte == null || ordensSelecionadas.length == 0
				|| funcionariosSelecionados.length == 0) {
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Preencha os espaços.", null));
		} else if (!pdc.formatoCorretoDATA(dataDe) || !pdc.formatoCorretoDATA(dataAte)) {
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "O Formato da data é dd/mm/aaaa.", null));
		} else if (dataDe.before(dataAte)) {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
					.getRequest();
			HttpSession session = request.getSession(true);
			String a1_cod = (String) session.getAttribute("A1_COD");
			SZA990DAO szadao = new SZA990DAO();
			listDeOSs = szadao.getOSPorCliente(a1_cod, pdd.converterDeDataPrimefacesParaDataSQL(dataDe),
					pdd.converterDeDataPrimefacesParaDataSQL(dataAte), vetorAux1[0], vetorAux1[1], vetorAux1[2],
					vetorAux1[3], vetorAux1[4], vetorAux1[5], vetorAux2[0], vetorAux2[1], vetorAux2[2], vetorAux2[3], vetorAux2[4],
					vetorAux2[5], vetorAux2[6], vetorAux2[7], vetorAux2[8], vetorAux2[9], vetorAux2[10], vetorAux2[11],
					vetorAux2[12], vetorAux2[13], vetorAux2[14], vetorAux2[15], vetorAux2[16], vetorAux2[17],
					vetorAux2[18], vetorAux2[19], vetorAux2[20], vetorAux2[21], vetorAux2[22], vetorAux2[23],
					vetorAux2[24], vetorAux2[25], vetorAux2[26], vetorAux2[27], vetorAux2[28], vetorAux2[29]);
			somaTotalHorasPorTipoOs();
			return "/listaDeOSs.xhtml?faces-redirect=true";
		} else if (dataDe.after(dataAte)) {
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Primeira data maior que segunda.", null));
		}
		return "";
	}

	public void somaTotalHorasPorTipoOs() {
		for (int cont1Fun = 0; cont1Fun < listDeFuncionarios.size(); ++cont1Fun) {
			for (int cont2List = 0; cont2List < listDeOSs.size(); ++cont2List) {
				if (listDeFuncionarios.get(cont1Fun).getAA1_NOMTEC().equals(listDeOSs.get(cont2List).ZA_NOMFUNC)) {
					if (listDeOSs.get(cont2List).ZA_TIPO.equals("CON")) {
						listDeFuncionarios.get(cont1Fun).horaTotalCON = pdh.somaDeHoras(
								listDeFuncionarios.get(cont1Fun).horaTotalCON, listDeOSs.get(cont2List).getZA_HRTOT());
					} else if (listDeOSs.get(cont2List).ZA_TIPO.equals("ORC")) {
						listDeFuncionarios.get(cont1Fun).horaTotalORC = pdh.somaDeHoras(
								listDeFuncionarios.get(cont1Fun).horaTotalORC, listDeOSs.get(cont2List).getZA_HRTOT());
					} else if (listDeOSs.get(cont2List).ZA_TIPO.equals("OUT")) {
						listDeFuncionarios.get(cont1Fun).horaTotalOUT = pdh.somaDeHoras(
								listDeFuncionarios.get(cont1Fun).horaTotalOUT, listDeOSs.get(cont2List).getZA_HRTOT());
					} else if (listDeOSs.get(cont2List).ZA_TIPO.equals("FAT")) {
						listDeFuncionarios.get(cont1Fun).horaTotalFAT = pdh.somaDeHoras(
								listDeFuncionarios.get(cont1Fun).horaTotalFAT, listDeOSs.get(cont2List).getZA_HRTOT());
					} else if (listDeOSs.get(cont2List).ZA_TIPO.equals("ANL")) {
						listDeFuncionarios.get(cont1Fun).horaTotalANL = pdh.somaDeHoras(
								listDeFuncionarios.get(cont1Fun).horaTotalANL, listDeOSs.get(cont2List).getZA_HRTOT());
					}
				}
			}
		}

		for (int cont = 0; cont < listDeFuncionarios.size(); cont++) {
			AA1990AUX aa1990aux = new AA1990AUX();
			aa1990aux.AA1_NOMTEC = listDeFuncionarios.get(cont).AA1_NOMTEC;
			aa1990aux.horaTotalFAT = listDeFuncionarios.get(cont).horaTotalFAT;
			aa1990aux.horaTotalORC = listDeFuncionarios.get(cont).horaTotalORC;
			aa1990aux.horaTotalCON = listDeFuncionarios.get(cont).horaTotalCON;
			aa1990aux.horaTotalOUT = listDeFuncionarios.get(cont).horaTotalOUT;
			aa1990aux.horaTotalANL = listDeFuncionarios.get(cont).horaTotalANL;
			aa1990aux.todasAsOss = pdh.somaDeHoras(aa1990aux.todasAsOss, listDeFuncionarios.get(cont).horaTotalFAT);
			aa1990aux.todasAsOss = pdh.somaDeHoras(aa1990aux.todasAsOss, listDeFuncionarios.get(cont).horaTotalORC);
			aa1990aux.todasAsOss = pdh.somaDeHoras(aa1990aux.todasAsOss, listDeFuncionarios.get(cont).horaTotalCON);
			aa1990aux.todasAsOss = pdh.somaDeHoras(aa1990aux.todasAsOss, listDeFuncionarios.get(cont).horaTotalOUT);
			aa1990aux.todasAsOss = pdh.somaDeHoras(aa1990aux.todasAsOss, listDeFuncionarios.get(cont).horaTotalANL);
			if (!aa1990aux.todasAsOss.equals("0:00")) {
				listDeFuncionariosAux.add(aa1990aux);
			}
		}
	}

	public void addTipoDeOS() {
		for (int i = 0; i < ordensSelecionadas.length; ++i) {
			vetorAux1[i] = ordensSelecionadas[i];
		}
	}

	public void addFuncionarios() {
		for (int i = 0; i < funcionariosSelecionados.length; ++i) {
			vetorAux2[i] = funcionariosSelecionados[i];
		}
	}

	@SuppressWarnings("unchecked")
	public String listarFuncionarios() {
		AA1990DAO aa1dao = new AA1990DAO();
		listDeFuncionarios = aa1dao.getFuncionarios();
		return "/Filtro?faces-redirect=true";
	}

	public String zerarTudoEVoltarParaRecursos() {
		vetorAux1 = new String[6];
		vetorAux2 = new String[30];
		listDeFuncionariosAux = new ArrayList<AA1990AUX>();
		return "/recursos?faces-redirect=true";
	}

	public List<SZA990> getList() {
		return listDeOSs;
	}

	public void setList(List<SZA990> list) {
		this.listDeOSs = list;
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

	public String[] getOrdensSelecionadas() {
		return ordensSelecionadas;
	}

	public void setOrdensSelecionadas(String[] ordensSelecionadas) {
		this.ordensSelecionadas = ordensSelecionadas;
	}

	public List<AA1990> getListDeFuncionarios() {
		return listDeFuncionarios;
	}

	public void setListDeFuncionarios(List<AA1990> listDeFuncionarios) {
		this.listDeFuncionarios = listDeFuncionarios;
	}

	public String[] getFuncionariosSelecionados() {
		return funcionariosSelecionados;
	}

	public void setFuncionariosSelecionados(String[] funcionariosSelecionados) {
		this.funcionariosSelecionados = funcionariosSelecionados;
	}

	public List<AA1990AUX> getListDeFuncionariosAux() {
		return listDeFuncionariosAux;
	}

	public void setListDeFuncionariosAux(List<AA1990AUX> listDeFuncionariosAux) {
		this.listDeFuncionariosAux = listDeFuncionariosAux;
	}
}