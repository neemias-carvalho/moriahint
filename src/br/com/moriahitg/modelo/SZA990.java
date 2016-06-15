package br.com.moriahitg.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.moriahitg.Pattern.PadraoDeDatas;
import br.com.moriahitg.Pattern.PadraoDeHoras;

@Entity
public class SZA990 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7429698623666890944L;

	@Id
	public String ZA_NUM, ZA_DTINI, ZA_TIPO, ZA_CLIENTE, ZA_LOJA, ZA_NOMCLI, ZA_CODFUN, ZA_NOMFUNC, ZA_EMISSAO,
			ZA_HRINI1, ZA_HRFIM, ZA_HRTOT1, ZA_HRINI2, ZA_HRFIM2, ZA_HRTOT2, ZA_HRTOT;

	PadraoDeDatas pdd = new PadraoDeDatas();
	PadraoDeHoras pdh = new PadraoDeHoras();

	@Id
	public String getZA_NUM() {
		return ZA_NUM;
	}

	@Id
	public void setZA_NUM(String zA_NUM) {
		ZA_NUM = zA_NUM;
	}

	@Id
	public String getZA_DTINI() {
		return pdd.converterParaDataEmPortugues(ZA_DTINI);
	}

	@Id
	public void setZA_DTINI(String zA_DTINI) {
		ZA_DTINI = zA_DTINI;
	}

	@Id
	public String getZA_TIPO() {
		return ZA_TIPO;
	}

	@Id
	public void setZA_TIPO(String zA_TIPO) {
		ZA_TIPO = zA_TIPO;
	}

	@Id
	public String getZA_CLIENTE() {
		return ZA_CLIENTE;
	}

	@Id
	public void setZA_CLIENTE(String zA_CLIENTE) {
		ZA_CLIENTE = zA_CLIENTE;
	}

	@Id
	public String getZA_LOJA() {
		return ZA_LOJA;
	}

	@Id
	public void setZA_LOJA(String zA_LOJA) {
		ZA_LOJA = zA_LOJA;
	}

	@Id
	public String getZA_NOMCLI() {
		return ZA_NOMCLI;
	}

	@Id
	public void setZA_NOMCLI(String zA_NOMCLI) {
		ZA_NOMCLI = zA_NOMCLI;
	}

	@Id
	public String getZA_CODFUN() {
		return ZA_CODFUN;
	}

	@Id
	public void setZA_CODFUN(String zA_CODFUN) {
		ZA_CODFUN = zA_CODFUN;
	}

	@Id
	public String getZA_NOMFUNC() {
		return ZA_NOMFUNC;
	}

	@Id
	public void setZA_NOMFUNC(String zA_NOMFUNC) {
		ZA_NOMFUNC = zA_NOMFUNC;
	}

	@Id
	public String getZA_EMISSAO() {
		return ZA_EMISSAO;
	}

	@Id
	public void setZA_EMISSAO(String zA_EMISSAO) {
		ZA_EMISSAO = zA_EMISSAO;
	}
	
	@Id
	public String getZA_HRINI1() {
		return pdh.converterParaFormatoDeHoras(ZA_HRINI1);
	}
	
	@Id
	public void setZA_HRINI1(String zA_HRINI1) {
		ZA_HRINI1 = zA_HRINI1;
	}
	
	@Id
	public String getZA_HRFIM() {
		return pdh.converterParaFormatoDeHoras(ZA_HRFIM);
	}
	
	@Id
	public void setZA_HRFIM(String zA_HRFIM) {
		ZA_HRFIM = zA_HRFIM;
	}
	
	@Id
	public String getZA_HRTOT1() {
		return pdh.converterParaFormatoDeHoras(ZA_HRTOT1);
	}
	
	@Id
	public void setZA_HRTOT1(String zA_HRTOT1) {
		ZA_HRTOT1 = zA_HRTOT1;
	}
	
	@Id
	public String getZA_HRINI2() {
		return pdh.converterParaFormatoDeHoras(ZA_HRINI2);
	}
	
	@Id
	public void setZA_HRINI2(String zA_HRINI2) {
		ZA_HRINI2 = zA_HRINI2;
	}
	
	@Id
	public String getZA_HRFIM2() {
		return pdh.converterParaFormatoDeHoras(ZA_HRFIM2);
	}
	
	@Id
	public void setZA_HRFIM2(String zA_HRFIM2) {
		ZA_HRFIM2 = zA_HRFIM2;
	}
	
	@Id
	public String getZA_HRTOT2() {
		return pdh.converterParaFormatoDeHoras(ZA_HRTOT2);
	}
	
	@Id
	public void setZA_HRTOT2(String zA_HRTOT2) {
		ZA_HRTOT2 = zA_HRTOT2;
	}

	public String getZA_HRTOT() {
		return pdh.converterParaFormatoDeHoras(ZA_HRTOT);
	}

	public void setZA_HRTOT(String zA_HRTOT) {
		ZA_HRTOT = zA_HRTOT;
	}
}