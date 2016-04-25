package br.com.moriahitg.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SA1990 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5920564125664908998L;

	
	private String A1_FILIAL, A1_COD, A1_LOJA, A1_PESSOA, A1_NOME, A1_NREDUZ, A1_END, A1_TIPO, A1_EST, A1_ESTADO, A1_COD_MUN, A1_MUN, A1_BAIRRO, A1_IBGE, A1_NATUREZ, A1_CEP, A1_DDI, A1_DDD, A1_TEL, A1_TELEX, A1_FAX, A1_ENDCOB, A1_PAIS, A1_ENDREC, A1_ENDENT, A1_CGC, A1_CONTATO, A1_INSCR, A1_PFISICA, A1_INSCRM, A1_VEND;
	
	private float A1_COMIS;
	
	private String  A1_REGIAO, A1_CONTA, A1_BCO1, A1_BCO2, A1_BCO3, A1_BCO4, A1_BCO5, A1_TRANSP, A1_TPFRET, A1_COND;
	
	private float  A1_DESC;
	
	private String  A1_PRIOR, A1_RISCO;
	
	private float  A1_LC;
	
	private String  A1_VENCLC, A1_CLASSE;
	
	private float  A1_LCFIN, A1_MOEDALC, A1_MSALDO, A1_MCOMPRA, A1_METR;
	
	private String  A1_PRICOM, A1_ULTCOM;
	
	private float  A1_NROCOM;
	
	private String  A1_FORMVIS;
	
	private float  A1_TEMVIS;
	
	private String  A1_ULTVIS, A1_TMPVIS, A1_TMPSTD, A1_CLASVEN, A1_MENSAGE;
	
	private float  A1_SALDUP;
	
	private String  A1_RECISS;
	
	private float  A1_SALPEDL, A1_NROPAG;
	
	private String  A1_TRANSF, A1_SUFRAMA;
	
	private float  A1_ATR, A1_VACUM, A1_SALPED, A1_TITPROT;
	
	private String  A1_DTULTIT;
	
	private float  A1_CHQDEVO, A1_MATR;
	
	private String  A1_DTULCHQ;
	
	private float  A1_MAIDUPL;
	
	private String  A1_TABELA, A1_INCISS;
	
	private float  A1_SALDUPM, A1_PAGATR;
	
	private String  A1_CXPOSTA, A1_ATIVIDA, A1_CARGO1, A1_CARGO2, A1_CARGO3;
	
	private float  A1_ALIQIR;
	
	private String  A1_SUPER, A1_OBSERV, A1_RG, A1_CALCSUF, A1_DTNASC;
	
	private float  A1_SALPEDB;
	
	private String  A1_CLIFAT, A1_GRPTRIB, A1_BAIRROC, A1_CEPC, A1_MUNC, A1_ESTC, A1_CEPE, A1_BAIRROE, A1_MUNE, A1_ESTE, A1_SATIV1, A1_SATIV2, A1_CODPAIS, A1_TPESSOA, A1_CODLOC, A1_TPISSRS, A1_SATIV3, A1_SATIV4, A1_SATIV5, A1_SATIV6, A1_SATIV7, A1_SATIV8, A1_CODMARC, A1_CODAGE;
	
	private float  A1_COMAGE;
	
	private String  A1_TIPCLI, A1_EMAIL, A1_DEST_1, A1_DEST_2, A1_CODMUN, A1_HPAGE, A1_DEST_3, A1_CBO, A1_CNAE, A1_CONDPAG;
	
	private float  A1_DIASPAG; 
	
	private String  A1_OBS, A1_AGREG, A1_CODHIST, A1_RECINSS, A1_RECCOFI, A1_RECCSLL, A1_RECPIS, A1_TIPPER;
	
	private float A1_SALFIN;
	
	private String  A1_CONTAB;
	
	private float  A1_SALFINM;
	
	private String  A1_B2B, A1_GRPVEN, A1_CLICNV, A1_INSCRUR, A1_MSBLQL, A1_SITUA, A1_NUMRA, A1_SUBCOD, A1_CDRDES, A1_FILDEB, A1_CODFOR, A1_ABICS, A1_BLEMAIL, A1_TIPOCLI, A1_VINCULO, A1_DTINIV, A1_DTFIMV, A1_LOCCONS, A1_CBAIRRE, A1_CODMUNE;
	
	private float  A1_PERFIL;
	
	private String  A1_HRTRANS, A1_UNIDVEN, A1_TIPPRFL, A1_PRF_VLD, A1_PRF_COD; 
	
	private Byte[] A1_PRF_OBS;
	
	private String  A1_REGPB, A1_USADDA, A1_SIMPLES, A1_IPWEB, A1_ENDNOT, A1_REGESIM, A1_FRETISS;
	
	private float A1_PERCATM;
	
	private String  A1_CODSIAF, A1_CTARE, A1_CEINSS, A1_ABATIMP, A1_FOMEZER, A1_TIMEKEE, A1_TDA, A1_SIMPNAC, A1_FILTRF, A1_CODFID, A1_RECFET, A1_MINIRF, A1_COMPLEM, A1_CONTRIB, A1_INCULT, A1_RECIRRF, A1_ORIGEM, A1_ENTID, A1_TRIBFAV, A1_IDHIST, A1_INDRET, A1_NIF, A1_IRBAX, A1_MATFUN, A1_OUTRMUN, A1_TPNFSE, A1_ALIFIXA, A1_CRDMA, A1_PRSTSER, A1_RFACS, A1_RFABOV;
	
	private float  A1_PERFECP;
	
	private String  A1_IENCONT, A1_TPDP, A1_TPJ, D_E_L_E_T_;
	
	private int R_E_C_N_O_, R_E_C_D_E_L_;
	
	public String getA1_FILIAL() {
		return A1_FILIAL;
	}
	public void setA1_FILIAL(String a1_FILIAL) {
		A1_FILIAL = a1_FILIAL;
	}
	@Id
	public String getA1_COD() {
		return A1_COD;
	}
	@Id
	public void setA1_COD(String a1_COD) {
		A1_COD = a1_COD;
	}
	public String getA1_LOJA() {
		return A1_LOJA;
	}
	public void setA1_LOJA(String a1_LOJA) {
		A1_LOJA = a1_LOJA;
	}
	public String getA1_PESSOA() {
		return A1_PESSOA;
	}
	public void setA1_PESSOA(String a1_PESSOA) {
		A1_PESSOA = a1_PESSOA;
	}
	public String getA1_NOME() {
		return A1_NOME;
	}
	public void setA1_NOME(String a1_NOME) {
		A1_NOME = a1_NOME;
	}
	public String getA1_NREDUZ() {
		return A1_NREDUZ;
	}
	public void setA1_NREDUZ(String a1_NREDUZ) {
		A1_NREDUZ = a1_NREDUZ;
	}
	public String getA1_END() {
		return A1_END;
	}
	public void setA1_END(String a1_END) {
		A1_END = a1_END;
	}
	public String getA1_TIPO() {
		return A1_TIPO;
	}
	public void setA1_TIPO(String a1_TIPO) {
		A1_TIPO = a1_TIPO;
	}
	public String getA1_EST() {
		return A1_EST;
	}
	public void setA1_EST(String a1_EST) {
		A1_EST = a1_EST;
	}
	public String getA1_ESTADO() {
		return A1_ESTADO;
	}
	public void setA1_ESTADO(String a1_ESTADO) {
		A1_ESTADO = a1_ESTADO;
	}
	public String getA1_COD_MUN() {
		return A1_COD_MUN;
	}
	public void setA1_COD_MUN(String a1_COD_MUN) {
		A1_COD_MUN = a1_COD_MUN;
	}
	public String getA1_MUN() {
		return A1_MUN;
	}
	public void setA1_MUN(String a1_MUN) {
		A1_MUN = a1_MUN;
	}
	public String getA1_BAIRRO() {
		return A1_BAIRRO;
	}
	public void setA1_BAIRRO(String a1_BAIRRO) {
		A1_BAIRRO = a1_BAIRRO;
	}
	public String getA1_IBGE() {
		return A1_IBGE;
	}
	public void setA1_IBGE(String a1_IBGE) {
		A1_IBGE = a1_IBGE;
	}
	public String getA1_NATUREZ() {
		return A1_NATUREZ;
	}
	public void setA1_NATUREZ(String a1_NATUREZ) {
		A1_NATUREZ = a1_NATUREZ;
	}
	public String getA1_CEP() {
		return A1_CEP;
	}
	public void setA1_CEP(String a1_CEP) {
		A1_CEP = a1_CEP;
	}
	public String getA1_DDI() {
		return A1_DDI;
	}
	public void setA1_DDI(String a1_DDI) {
		A1_DDI = a1_DDI;
	}
	public String getA1_DDD() {
		return A1_DDD;
	}
	public void setA1_DDD(String a1_DDD) {
		A1_DDD = a1_DDD;
	}
	public String getA1_TEL() {
		return A1_TEL;
	}
	public void setA1_TEL(String a1_TEL) {
		A1_TEL = a1_TEL;
	}
	public String getA1_TELEX() {
		return A1_TELEX;
	}
	public void setA1_TELEX(String a1_TELEX) {
		A1_TELEX = a1_TELEX;
	}
	public String getA1_FAX() {
		return A1_FAX;
	}
	public void setA1_FAX(String a1_FAX) {
		A1_FAX = a1_FAX;
	}
	public String getA1_ENDCOB() {
		return A1_ENDCOB;
	}
	public void setA1_ENDCOB(String a1_ENDCOB) {
		A1_ENDCOB = a1_ENDCOB;
	}
	public String getA1_PAIS() {
		return A1_PAIS;
	}
	public void setA1_PAIS(String a1_PAIS) {
		A1_PAIS = a1_PAIS;
	}
	public String getA1_ENDREC() {
		return A1_ENDREC;
	}
	public void setA1_ENDREC(String a1_ENDREC) {
		A1_ENDREC = a1_ENDREC;
	}
	public String getA1_ENDENT() {
		return A1_ENDENT;
	}
	public void setA1_ENDENT(String a1_ENDENT) {
		A1_ENDENT = a1_ENDENT;
	}
	
	public String getA1_CGC() {
		return A1_CGC;
	}
	
	public void setA1_CGC(String a1_CGC) {
		A1_CGC = a1_CGC;
	}
	public String getA1_CONTATO() {
		return A1_CONTATO;
	}
	public void setA1_CONTATO(String a1_CONTATO) {
		A1_CONTATO = a1_CONTATO;
	}
	public String getA1_INSCR() {
		return A1_INSCR;
	}
	public void setA1_INSCR(String a1_INSCR) {
		A1_INSCR = a1_INSCR;
	}
	public String getA1_PFISICA() {
		return A1_PFISICA;
	}
	public void setA1_PFISICA(String a1_PFISICA) {
		A1_PFISICA = a1_PFISICA;
	}
	public String getA1_INSCRM() {
		return A1_INSCRM;
	}
	public void setA1_INSCRM(String a1_INSCRM) {
		A1_INSCRM = a1_INSCRM;
	}
	public String getA1_VEND() {
		return A1_VEND;
	}
	public void setA1_VEND(String a1_VEND) {
		A1_VEND = a1_VEND;
	}
	public float getA1_COMIS() {
		return A1_COMIS;
	}
	public void setA1_COMIS(float a1_COMIS) {
		A1_COMIS = a1_COMIS;
	}
	public String getA1_REGIAO() {
		return A1_REGIAO;
	}
	public void setA1_REGIAO(String a1_REGIAO) {
		A1_REGIAO = a1_REGIAO;
	}
	public String getA1_CONTA() {
		return A1_CONTA;
	}
	public void setA1_CONTA(String a1_CONTA) {
		A1_CONTA = a1_CONTA;
	}
	public String getA1_BCO1() {
		return A1_BCO1;
	}
	public void setA1_BCO1(String a1_BCO1) {
		A1_BCO1 = a1_BCO1;
	}
	public String getA1_BCO2() {
		return A1_BCO2;
	}
	public void setA1_BCO2(String a1_BCO2) {
		A1_BCO2 = a1_BCO2;
	}
	public String getA1_BCO3() {
		return A1_BCO3;
	}
	public void setA1_BCO3(String a1_BCO3) {
		A1_BCO3 = a1_BCO3;
	}
	public String getA1_BCO4() {
		return A1_BCO4;
	}
	public void setA1_BCO4(String a1_BCO4) {
		A1_BCO4 = a1_BCO4;
	}
	public String getA1_BCO5() {
		return A1_BCO5;
	}
	public void setA1_BCO5(String a1_BCO5) {
		A1_BCO5 = a1_BCO5;
	}
	public String getA1_TRANSP() {
		return A1_TRANSP;
	}
	public void setA1_TRANSP(String a1_TRANSP) {
		A1_TRANSP = a1_TRANSP;
	}
	public String getA1_TPFRET() {
		return A1_TPFRET;
	}
	public void setA1_TPFRET(String a1_TPFRET) {
		A1_TPFRET = a1_TPFRET;
	}
	public String getA1_COND() {
		return A1_COND;
	}
	public void setA1_COND(String a1_COND) {
		A1_COND = a1_COND;
	}
	public float getA1_DESC() {
		return A1_DESC;
	}
	public void setA1_DESC(float a1_DESC) {
		A1_DESC = a1_DESC;
	}
	public String getA1_PRIOR() {
		return A1_PRIOR;
	}
	public void setA1_PRIOR(String a1_PRIOR) {
		A1_PRIOR = a1_PRIOR;
	}
	public String getA1_RISCO() {
		return A1_RISCO;
	}
	public void setA1_RISCO(String a1_RISCO) {
		A1_RISCO = a1_RISCO;
	}
	public float getA1_LC() {
		return A1_LC;
	}
	public void setA1_LC(float a1_LC) {
		A1_LC = a1_LC;
	}
	public String getA1_VENCLC() {
		return A1_VENCLC;
	}
	public void setA1_VENCLC(String a1_VENCLC) {
		A1_VENCLC = a1_VENCLC;
	}
	public String getA1_CLASSE() {
		return A1_CLASSE;
	}
	public void setA1_CLASSE(String a1_CLASSE) {
		A1_CLASSE = a1_CLASSE;
	}
	public float getA1_LCFIN() {
		return A1_LCFIN;
	}
	public void setA1_LCFIN(float a1_LCFIN) {
		A1_LCFIN = a1_LCFIN;
	}
	public float getA1_MOEDALC() {
		return A1_MOEDALC;
	}
	public void setA1_MOEDALC(float a1_MOEDALC) {
		A1_MOEDALC = a1_MOEDALC;
	}
	public float getA1_MSALDO() {
		return A1_MSALDO;
	}
	public void setA1_MSALDO(float a1_MSALDO) {
		A1_MSALDO = a1_MSALDO;
	}
	public float getA1_MCOMPRA() {
		return A1_MCOMPRA;
	}
	public void setA1_MCOMPRA(float a1_MCOMPRA) {
		A1_MCOMPRA = a1_MCOMPRA;
	}
	public float getA1_METR() {
		return A1_METR;
	}
	public void setA1_METR(float a1_METR) {
		A1_METR = a1_METR;
	}
	public String getA1_PRICOM() {
		return A1_PRICOM;
	}
	public void setA1_PRICOM(String a1_PRICOM) {
		A1_PRICOM = a1_PRICOM;
	}
	public String getA1_ULTCOM() {
		return A1_ULTCOM;
	}
	public void setA1_ULTCOM(String a1_ULTCOM) {
		A1_ULTCOM = a1_ULTCOM;
	}
	public float getA1_NROCOM() {
		return A1_NROCOM;
	}
	public void setA1_NROCOM(float a1_NROCOM) {
		A1_NROCOM = a1_NROCOM;
	}
	public String getA1_FORMVIS() {
		return A1_FORMVIS;
	}
	public void setA1_FORMVIS(String a1_FORMVIS) {
		A1_FORMVIS = a1_FORMVIS;
	}
	public float getA1_TEMVIS() {
		return A1_TEMVIS;
	}
	public void setA1_TEMVIS(float a1_TEMVIS) {
		A1_TEMVIS = a1_TEMVIS;
	}
	public String getA1_ULTVIS() {
		return A1_ULTVIS;
	}
	public void setA1_ULTVIS(String a1_ULTVIS) {
		A1_ULTVIS = a1_ULTVIS;
	}
	public String getA1_TMPVIS() {
		return A1_TMPVIS;
	}
	public void setA1_TMPVIS(String a1_TMPVIS) {
		A1_TMPVIS = a1_TMPVIS;
	}
	public String getA1_TMPSTD() {
		return A1_TMPSTD;
	}
	public void setA1_TMPSTD(String a1_TMPSTD) {
		A1_TMPSTD = a1_TMPSTD;
	}
	public String getA1_CLASVEN() {
		return A1_CLASVEN;
	}
	public void setA1_CLASVEN(String a1_CLASVEN) {
		A1_CLASVEN = a1_CLASVEN;
	}
	public String getA1_MENSAGE() {
		return A1_MENSAGE;
	}
	public void setA1_MENSAGE(String a1_MENSAGE) {
		A1_MENSAGE = a1_MENSAGE;
	}
	public float getA1_SALDUP() {
		return A1_SALDUP;
	}
	public void setA1_SALDUP(float a1_SALDUP) {
		A1_SALDUP = a1_SALDUP;
	}
	public String getA1_RECISS() {
		return A1_RECISS;
	}
	public void setA1_RECISS(String a1_RECISS) {
		A1_RECISS = a1_RECISS;
	}
	public float getA1_SALPEDL() {
		return A1_SALPEDL;
	}
	public void setA1_SALPEDL(float a1_SALPEDL) {
		A1_SALPEDL = a1_SALPEDL;
	}
	public float getA1_NROPAG() {
		return A1_NROPAG;
	}
	public void setA1_NROPAG(float a1_NROPAG) {
		A1_NROPAG = a1_NROPAG;
	}
	public String getA1_TRANSF() {
		return A1_TRANSF;
	}
	public void setA1_TRANSF(String a1_TRANSF) {
		A1_TRANSF = a1_TRANSF;
	}
	public String getA1_SUFRAMA() {
		return A1_SUFRAMA;
	}
	public void setA1_SUFRAMA(String a1_SUFRAMA) {
		A1_SUFRAMA = a1_SUFRAMA;
	}
	public float getA1_ATR() {
		return A1_ATR;
	}
	public void setA1_ATR(float a1_ATR) {
		A1_ATR = a1_ATR;
	}
	public float getA1_VACUM() {
		return A1_VACUM;
	}
	public void setA1_VACUM(float a1_VACUM) {
		A1_VACUM = a1_VACUM;
	}
	public float getA1_SALPED() {
		return A1_SALPED;
	}
	public void setA1_SALPED(float a1_SALPED) {
		A1_SALPED = a1_SALPED;
	}
	public float getA1_TITPROT() {
		return A1_TITPROT;
	}
	public void setA1_TITPROT(float a1_TITPROT) {
		A1_TITPROT = a1_TITPROT;
	}
	public String getA1_DTULTIT() {
		return A1_DTULTIT;
	}
	public void setA1_DTULTIT(String a1_DTULTIT) {
		A1_DTULTIT = a1_DTULTIT;
	}
	public float getA1_CHQDEVO() {
		return A1_CHQDEVO;
	}
	public void setA1_CHQDEVO(float a1_CHQDEVO) {
		A1_CHQDEVO = a1_CHQDEVO;
	}
	public float getA1_MATR() {
		return A1_MATR;
	}
	public void setA1_MATR(float a1_MATR) {
		A1_MATR = a1_MATR;
	}
	public String getA1_DTULCHQ() {
		return A1_DTULCHQ;
	}
	public void setA1_DTULCHQ(String a1_DTULCHQ) {
		A1_DTULCHQ = a1_DTULCHQ;
	}
	public float getA1_MAIDUPL() {
		return A1_MAIDUPL;
	}
	public void setA1_MAIDUPL(float a1_MAIDUPL) {
		A1_MAIDUPL = a1_MAIDUPL;
	}
	public String getA1_TABELA() {
		return A1_TABELA;
	}
	public void setA1_TABELA(String a1_TABELA) {
		A1_TABELA = a1_TABELA;
	}
	public String getA1_INCISS() {
		return A1_INCISS;
	}
	public void setA1_INCISS(String a1_INCISS) {
		A1_INCISS = a1_INCISS;
	}
	public float getA1_SALDUPM() {
		return A1_SALDUPM;
	}
	public void setA1_SALDUPM(float a1_SALDUPM) {
		A1_SALDUPM = a1_SALDUPM;
	}
	public float getA1_PAGATR() {
		return A1_PAGATR;
	}
	public void setA1_PAGATR(float a1_PAGATR) {
		A1_PAGATR = a1_PAGATR;
	}
	public String getA1_CXPOSTA() {
		return A1_CXPOSTA;
	}
	public void setA1_CXPOSTA(String a1_CXPOSTA) {
		A1_CXPOSTA = a1_CXPOSTA;
	}
	public String getA1_ATIVIDA() {
		return A1_ATIVIDA;
	}
	public void setA1_ATIVIDA(String a1_ATIVIDA) {
		A1_ATIVIDA = a1_ATIVIDA;
	}
	public String getA1_CARGO1() {
		return A1_CARGO1;
	}
	public void setA1_CARGO1(String a1_CARGO1) {
		A1_CARGO1 = a1_CARGO1;
	}
	public String getA1_CARGO2() {
		return A1_CARGO2;
	}
	public void setA1_CARGO2(String a1_CARGO2) {
		A1_CARGO2 = a1_CARGO2;
	}
	public String getA1_CARGO3() {
		return A1_CARGO3;
	}
	public void setA1_CARGO3(String a1_CARGO3) {
		A1_CARGO3 = a1_CARGO3;
	}
	public float getA1_ALIQIR() {
		return A1_ALIQIR;
	}
	public void setA1_ALIQIR(float a1_ALIQIR) {
		A1_ALIQIR = a1_ALIQIR;
	}
	public String getA1_SUPER() {
		return A1_SUPER;
	}
	public void setA1_SUPER(String a1_SUPER) {
		A1_SUPER = a1_SUPER;
	}
	public String getA1_OBSERV() {
		return A1_OBSERV;
	}
	public void setA1_OBSERV(String a1_OBSERV) {
		A1_OBSERV = a1_OBSERV;
	}
	public String getA1_RG() {
		return A1_RG;
	}
	public void setA1_RG(String a1_RG) {
		A1_RG = a1_RG;
	}
	public String getA1_CALCSUF() {
		return A1_CALCSUF;
	}
	public void setA1_CALCSUF(String a1_CALCSUF) {
		A1_CALCSUF = a1_CALCSUF;
	}
	public String getA1_DTNASC() {
		return A1_DTNASC;
	}
	public void setA1_DTNASC(String a1_DTNASC) {
		A1_DTNASC = a1_DTNASC;
	}
	public float getA1_SALPEDB() {
		return A1_SALPEDB;
	}
	public void setA1_SALPEDB(float a1_SALPEDB) {
		A1_SALPEDB = a1_SALPEDB;
	}
	public String getA1_CLIFAT() {
		return A1_CLIFAT;
	}
	public void setA1_CLIFAT(String a1_CLIFAT) {
		A1_CLIFAT = a1_CLIFAT;
	}
	public String getA1_GRPTRIB() {
		return A1_GRPTRIB;
	}
	public void setA1_GRPTRIB(String a1_GRPTRIB) {
		A1_GRPTRIB = a1_GRPTRIB;
	}
	public String getA1_BAIRROC() {
		return A1_BAIRROC;
	}
	public void setA1_BAIRROC(String a1_BAIRROC) {
		A1_BAIRROC = a1_BAIRROC;
	}
	public String getA1_CEPC() {
		return A1_CEPC;
	}
	public void setA1_CEPC(String a1_CEPC) {
		A1_CEPC = a1_CEPC;
	}
	public String getA1_MUNC() {
		return A1_MUNC;
	}
	public void setA1_MUNC(String a1_MUNC) {
		A1_MUNC = a1_MUNC;
	}
	public String getA1_ESTC() {
		return A1_ESTC;
	}
	public void setA1_ESTC(String a1_ESTC) {
		A1_ESTC = a1_ESTC;
	}
	public String getA1_CEPE() {
		return A1_CEPE;
	}
	public void setA1_CEPE(String a1_CEPE) {
		A1_CEPE = a1_CEPE;
	}
	public String getA1_BAIRROE() {
		return A1_BAIRROE;
	}
	public void setA1_BAIRROE(String a1_BAIRROE) {
		A1_BAIRROE = a1_BAIRROE;
	}
	public String getA1_MUNE() {
		return A1_MUNE;
	}
	public void setA1_MUNE(String a1_MUNE) {
		A1_MUNE = a1_MUNE;
	}
	public String getA1_ESTE() {
		return A1_ESTE;
	}
	public void setA1_ESTE(String a1_ESTE) {
		A1_ESTE = a1_ESTE;
	}
	public String getA1_SATIV1() {
		return A1_SATIV1;
	}
	public void setA1_SATIV1(String a1_SATIV1) {
		A1_SATIV1 = a1_SATIV1;
	}
	public String getA1_SATIV2() {
		return A1_SATIV2;
	}
	public void setA1_SATIV2(String a1_SATIV2) {
		A1_SATIV2 = a1_SATIV2;
	}
	public String getA1_CODPAIS() {
		return A1_CODPAIS;
	}
	public void setA1_CODPAIS(String a1_CODPAIS) {
		A1_CODPAIS = a1_CODPAIS;
	}
	public String getA1_TPESSOA() {
		return A1_TPESSOA;
	}
	public void setA1_TPESSOA(String a1_TPESSOA) {
		A1_TPESSOA = a1_TPESSOA;
	}
	public String getA1_CODLOC() {
		return A1_CODLOC;
	}
	public void setA1_CODLOC(String a1_CODLOC) {
		A1_CODLOC = a1_CODLOC;
	}
	public String getA1_TPISSRS() {
		return A1_TPISSRS;
	}
	public void setA1_TPISSRS(String a1_TPISSRS) {
		A1_TPISSRS = a1_TPISSRS;
	}
	public String getA1_SATIV3() {
		return A1_SATIV3;
	}
	public void setA1_SATIV3(String a1_SATIV3) {
		A1_SATIV3 = a1_SATIV3;
	}
	public String getA1_SATIV4() {
		return A1_SATIV4;
	}
	public void setA1_SATIV4(String a1_SATIV4) {
		A1_SATIV4 = a1_SATIV4;
	}
	public String getA1_SATIV5() {
		return A1_SATIV5;
	}
	public void setA1_SATIV5(String a1_SATIV5) {
		A1_SATIV5 = a1_SATIV5;
	}
	public String getA1_SATIV6() {
		return A1_SATIV6;
	}
	public void setA1_SATIV6(String a1_SATIV6) {
		A1_SATIV6 = a1_SATIV6;
	}
	public String getA1_SATIV7() {
		return A1_SATIV7;
	}
	public void setA1_SATIV7(String a1_SATIV7) {
		A1_SATIV7 = a1_SATIV7;
	}
	public String getA1_SATIV8() {
		return A1_SATIV8;
	}
	public void setA1_SATIV8(String a1_SATIV8) {
		A1_SATIV8 = a1_SATIV8;
	}
	public String getA1_CODMARC() {
		return A1_CODMARC;
	}
	public void setA1_CODMARC(String a1_CODMARC) {
		A1_CODMARC = a1_CODMARC;
	}
	public String getA1_CODAGE() {
		return A1_CODAGE;
	}
	public void setA1_CODAGE(String a1_CODAGE) {
		A1_CODAGE = a1_CODAGE;
	}
	public float getA1_COMAGE() {
		return A1_COMAGE;
	}
	public void setA1_COMAGE(float a1_COMAGE) {
		A1_COMAGE = a1_COMAGE;
	}
	public String getA1_TIPCLI() {
		return A1_TIPCLI;
	}
	public void setA1_TIPCLI(String a1_TIPCLI) {
		A1_TIPCLI = a1_TIPCLI;
	}
	public String getA1_EMAIL() {
		return A1_EMAIL;
	}
	public void setA1_EMAIL(String a1_EMAIL) {
		A1_EMAIL = a1_EMAIL;
	}
	public String getA1_DEST_1() {
		return A1_DEST_1;
	}
	public void setA1_DEST_1(String a1_DEST_1) {
		A1_DEST_1 = a1_DEST_1;
	}
	public String getA1_DEST_2() {
		return A1_DEST_2;
	}
	public void setA1_DEST_2(String a1_DEST_2) {
		A1_DEST_2 = a1_DEST_2;
	}
	public String getA1_CODMUN() {
		return A1_CODMUN;
	}
	public void setA1_CODMUN(String a1_CODMUN) {
		A1_CODMUN = a1_CODMUN;
	}
	public String getA1_HPAGE() {
		return A1_HPAGE;
	}
	public void setA1_HPAGE(String a1_HPAGE) {
		A1_HPAGE = a1_HPAGE;
	}
	public String getA1_DEST_3() {
		return A1_DEST_3;
	}
	public void setA1_DEST_3(String a1_DEST_3) {
		A1_DEST_3 = a1_DEST_3;
	}
	public String getA1_CBO() {
		return A1_CBO;
	}
	public void setA1_CBO(String a1_CBO) {
		A1_CBO = a1_CBO;
	}
	public String getA1_CNAE() {
		return A1_CNAE;
	}
	public void setA1_CNAE(String a1_CNAE) {
		A1_CNAE = a1_CNAE;
	}
	public String getA1_CONDPAG() {
		return A1_CONDPAG;
	}
	public void setA1_CONDPAG(String a1_CONDPAG) {
		A1_CONDPAG = a1_CONDPAG;
	}
	public float getA1_DIASPAG() {
		return A1_DIASPAG;
	}
	public void setA1_DIASPAG(float a1_DIASPAG) {
		A1_DIASPAG = a1_DIASPAG;
	}
	public String getA1_OBS() {
		return A1_OBS;
	}
	public void setA1_OBS(String a1_OBS) {
		A1_OBS = a1_OBS;
	}
	public String getA1_AGREG() {
		return A1_AGREG;
	}
	public void setA1_AGREG(String a1_AGREG) {
		A1_AGREG = a1_AGREG;
	}
	public String getA1_CODHIST() {
		return A1_CODHIST;
	}
	public void setA1_CODHIST(String a1_CODHIST) {
		A1_CODHIST = a1_CODHIST;
	}
	public String getA1_RECINSS() {
		return A1_RECINSS;
	}
	public void setA1_RECINSS(String a1_RECINSS) {
		A1_RECINSS = a1_RECINSS;
	}
	public String getA1_RECCOFI() {
		return A1_RECCOFI;
	}
	public void setA1_RECCOFI(String a1_RECCOFI) {
		A1_RECCOFI = a1_RECCOFI;
	}
	public String getA1_RECCSLL() {
		return A1_RECCSLL;
	}
	public void setA1_RECCSLL(String a1_RECCSLL) {
		A1_RECCSLL = a1_RECCSLL;
	}
	public String getA1_RECPIS() {
		return A1_RECPIS;
	}
	public void setA1_RECPIS(String a1_RECPIS) {
		A1_RECPIS = a1_RECPIS;
	}
	public String getA1_TIPPER() {
		return A1_TIPPER;
	}
	public void setA1_TIPPER(String a1_TIPPER) {
		A1_TIPPER = a1_TIPPER;
	}
	public float getA1_SALFIN() {
		return A1_SALFIN;
	}
	public void setA1_SALFIN(float a1_SALFIN) {
		A1_SALFIN = a1_SALFIN;
	}
	public String getA1_CONTAB() {
		return A1_CONTAB;
	}
	public void setA1_CONTAB(String a1_CONTAB) {
		A1_CONTAB = a1_CONTAB;
	}
	public float getA1_SALFINM() {
		return A1_SALFINM;
	}
	public void setA1_SALFINM(float a1_SALFINM) {
		A1_SALFINM = a1_SALFINM;
	}
	public String getA1_B2B() {
		return A1_B2B;
	}
	public void setA1_B2B(String a1_B2B) {
		A1_B2B = a1_B2B;
	}
	public String getA1_GRPVEN() {
		return A1_GRPVEN;
	}
	public void setA1_GRPVEN(String a1_GRPVEN) {
		A1_GRPVEN = a1_GRPVEN;
	}
	public String getA1_CLICNV() {
		return A1_CLICNV;
	}
	public void setA1_CLICNV(String a1_CLICNV) {
		A1_CLICNV = a1_CLICNV;
	}
	public String getA1_INSCRUR() {
		return A1_INSCRUR;
	}
	public void setA1_INSCRUR(String a1_INSCRUR) {
		A1_INSCRUR = a1_INSCRUR;
	}
	public String getA1_MSBLQL() {
		return A1_MSBLQL;
	}
	public void setA1_MSBLQL(String a1_MSBLQL) {
		A1_MSBLQL = a1_MSBLQL;
	}
	public String getA1_SITUA() {
		return A1_SITUA;
	}
	public void setA1_SITUA(String a1_SITUA) {
		A1_SITUA = a1_SITUA;
	}
	public String getA1_NUMRA() {
		return A1_NUMRA;
	}
	public void setA1_NUMRA(String a1_NUMRA) {
		A1_NUMRA = a1_NUMRA;
	}
	public String getA1_SUBCOD() {
		return A1_SUBCOD;
	}
	public void setA1_SUBCOD(String a1_SUBCOD) {
		A1_SUBCOD = a1_SUBCOD;
	}
	public String getA1_CDRDES() {
		return A1_CDRDES;
	}
	public void setA1_CDRDES(String a1_CDRDES) {
		A1_CDRDES = a1_CDRDES;
	}
	public String getA1_FILDEB() {
		return A1_FILDEB;
	}
	public void setA1_FILDEB(String a1_FILDEB) {
		A1_FILDEB = a1_FILDEB;
	}
	public String getA1_CODFOR() {
		return A1_CODFOR;
	}
	public void setA1_CODFOR(String a1_CODFOR) {
		A1_CODFOR = a1_CODFOR;
	}
	public String getA1_ABICS() {
		return A1_ABICS;
	}
	public void setA1_ABICS(String a1_ABICS) {
		A1_ABICS = a1_ABICS;
	}
	public String getA1_BLEMAIL() {
		return A1_BLEMAIL;
	}
	public void setA1_BLEMAIL(String a1_BLEMAIL) {
		A1_BLEMAIL = a1_BLEMAIL;
	}
	public String getA1_TIPOCLI() {
		return A1_TIPOCLI;
	}
	public void setA1_TIPOCLI(String a1_TIPOCLI) {
		A1_TIPOCLI = a1_TIPOCLI;
	}
	public String getA1_VINCULO() {
		return A1_VINCULO;
	}
	public void setA1_VINCULO(String a1_VINCULO) {
		A1_VINCULO = a1_VINCULO;
	}
	public String getA1_DTINIV() {
		return A1_DTINIV;
	}
	public void setA1_DTINIV(String a1_DTINIV) {
		A1_DTINIV = a1_DTINIV;
	}
	public String getA1_DTFIMV() {
		return A1_DTFIMV;
	}
	public void setA1_DTFIMV(String a1_DTFIMV) {
		A1_DTFIMV = a1_DTFIMV;
	}
	public String getA1_LOCCONS() {
		return A1_LOCCONS;
	}
	public void setA1_LOCCONS(String a1_LOCCONS) {
		A1_LOCCONS = a1_LOCCONS;
	}
	public String getA1_CBAIRRE() {
		return A1_CBAIRRE;
	}
	public void setA1_CBAIRRE(String a1_CBAIRRE) {
		A1_CBAIRRE = a1_CBAIRRE;
	}
	public String getA1_CODMUNE() {
		return A1_CODMUNE;
	}
	public void setA1_CODMUNE(String a1_CODMUNE) {
		A1_CODMUNE = a1_CODMUNE;
	}
	public float getA1_PERFIL() {
		return A1_PERFIL;
	}
	public void setA1_PERFIL(float a1_PERFIL) {
		A1_PERFIL = a1_PERFIL;
	}
	public String getA1_HRTRANS() {
		return A1_HRTRANS;
	}
	public void setA1_HRTRANS(String a1_HRTRANS) {
		A1_HRTRANS = a1_HRTRANS;
	}
	public String getA1_UNIDVEN() {
		return A1_UNIDVEN;
	}
	public void setA1_UNIDVEN(String a1_UNIDVEN) {
		A1_UNIDVEN = a1_UNIDVEN;
	}
	public String getA1_TIPPRFL() {
		return A1_TIPPRFL;
	}
	public void setA1_TIPPRFL(String a1_TIPPRFL) {
		A1_TIPPRFL = a1_TIPPRFL;
	}
	public String getA1_PRF_VLD() {
		return A1_PRF_VLD;
	}
	public void setA1_PRF_VLD(String a1_PRF_VLD) {
		A1_PRF_VLD = a1_PRF_VLD;
	}
	public String getA1_PRF_COD() {
		return A1_PRF_COD;
	}
	public void setA1_PRF_COD(String a1_PRF_COD) {
		A1_PRF_COD = a1_PRF_COD;
	}
	public Byte[] getA1_PRF_OBS() {
		return A1_PRF_OBS;
	}
	public void setA1_PRF_OBS(Byte[] a1_PRF_OBS) {
		A1_PRF_OBS = a1_PRF_OBS;
	}
	public String getA1_REGPB() {
		return A1_REGPB;
	}
	public void setA1_REGPB(String a1_REGPB) {
		A1_REGPB = a1_REGPB;
	}
	public String getA1_USADDA() {
		return A1_USADDA;
	}
	public void setA1_USADDA(String a1_USADDA) {
		A1_USADDA = a1_USADDA;
	}
	public String getA1_SIMPLES() {
		return A1_SIMPLES;
	}
	public void setA1_SIMPLES(String a1_SIMPLES) {
		A1_SIMPLES = a1_SIMPLES;
	}
	public String getA1_IPWEB() {
		return A1_IPWEB;
	}
	public void setA1_IPWEB(String a1_IPWEB) {
		A1_IPWEB = a1_IPWEB;
	}
	public String getA1_ENDNOT() {
		return A1_ENDNOT;
	}
	public void setA1_ENDNOT(String a1_ENDNOT) {
		A1_ENDNOT = a1_ENDNOT;
	}
	public String getA1_REGESIM() {
		return A1_REGESIM;
	}
	public void setA1_REGESIM(String a1_REGESIM) {
		A1_REGESIM = a1_REGESIM;
	}
	public String getA1_FRETISS() {
		return A1_FRETISS;
	}
	public void setA1_FRETISS(String a1_FRETISS) {
		A1_FRETISS = a1_FRETISS;
	}
	public float getA1_PERCATM() {
		return A1_PERCATM;
	}
	public void setA1_PERCATM(float a1_PERCATM) {
		A1_PERCATM = a1_PERCATM;
	}
	public String getA1_CODSIAF() {
		return A1_CODSIAF;
	}
	public void setA1_CODSIAF(String a1_CODSIAF) {
		A1_CODSIAF = a1_CODSIAF;
	}
	public String getA1_CTARE() {
		return A1_CTARE;
	}
	public void setA1_CTARE(String a1_CTARE) {
		A1_CTARE = a1_CTARE;
	}
	public String getA1_CEINSS() {
		return A1_CEINSS;
	}
	public void setA1_CEINSS(String a1_CEINSS) {
		A1_CEINSS = a1_CEINSS;
	}
	public String getA1_ABATIMP() {
		return A1_ABATIMP;
	}
	public void setA1_ABATIMP(String a1_ABATIMP) {
		A1_ABATIMP = a1_ABATIMP;
	}
	public String getA1_FOMEZER() {
		return A1_FOMEZER;
	}
	public void setA1_FOMEZER(String a1_FOMEZER) {
		A1_FOMEZER = a1_FOMEZER;
	}
	public String getA1_TIMEKEE() {
		return A1_TIMEKEE;
	}
	public void setA1_TIMEKEE(String a1_TIMEKEE) {
		A1_TIMEKEE = a1_TIMEKEE;
	}
	public String getA1_TDA() {
		return A1_TDA;
	}
	public void setA1_TDA(String a1_TDA) {
		A1_TDA = a1_TDA;
	}
	public String getA1_SIMPNAC() {
		return A1_SIMPNAC;
	}
	public void setA1_SIMPNAC(String a1_SIMPNAC) {
		A1_SIMPNAC = a1_SIMPNAC;
	}
	public String getA1_FILTRF() {
		return A1_FILTRF;
	}
	public void setA1_FILTRF(String a1_FILTRF) {
		A1_FILTRF = a1_FILTRF;
	}
	public String getA1_CODFID() {
		return A1_CODFID;
	}
	public void setA1_CODFID(String a1_CODFID) {
		A1_CODFID = a1_CODFID;
	}
	public String getA1_RECFET() {
		return A1_RECFET;
	}
	public void setA1_RECFET(String a1_RECFET) {
		A1_RECFET = a1_RECFET;
	}
	public String getA1_MINIRF() {
		return A1_MINIRF;
	}
	public void setA1_MINIRF(String a1_MINIRF) {
		A1_MINIRF = a1_MINIRF;
	}
	public String getA1_COMPLEM() {
		return A1_COMPLEM;
	}
	public void setA1_COMPLEM(String a1_COMPLEM) {
		A1_COMPLEM = a1_COMPLEM;
	}
	public String getA1_CONTRIB() {
		return A1_CONTRIB;
	}
	public void setA1_CONTRIB(String a1_CONTRIB) {
		A1_CONTRIB = a1_CONTRIB;
	}
	public String getA1_INCULT() {
		return A1_INCULT;
	}
	public void setA1_INCULT(String a1_INCULT) {
		A1_INCULT = a1_INCULT;
	}
	public String getA1_RECIRRF() {
		return A1_RECIRRF;
	}
	public void setA1_RECIRRF(String a1_RECIRRF) {
		A1_RECIRRF = a1_RECIRRF;
	}
	public String getA1_ORIGEM() {
		return A1_ORIGEM;
	}
	public void setA1_ORIGEM(String a1_ORIGEM) {
		A1_ORIGEM = a1_ORIGEM;
	}
	public String getA1_ENTID() {
		return A1_ENTID;
	}
	public void setA1_ENTID(String a1_ENTID) {
		A1_ENTID = a1_ENTID;
	}
	public String getA1_TRIBFAV() {
		return A1_TRIBFAV;
	}
	public void setA1_TRIBFAV(String a1_TRIBFAV) {
		A1_TRIBFAV = a1_TRIBFAV;
	}
	public String getA1_IDHIST() {
		return A1_IDHIST;
	}
	public void setA1_IDHIST(String a1_IDHIST) {
		A1_IDHIST = a1_IDHIST;
	}
	public String getA1_INDRET() {
		return A1_INDRET;
	}
	public void setA1_INDRET(String a1_INDRET) {
		A1_INDRET = a1_INDRET;
	}
	public String getA1_NIF() {
		return A1_NIF;
	}
	public void setA1_NIF(String a1_NIF) {
		A1_NIF = a1_NIF;
	}
	public String getA1_IRBAX() {
		return A1_IRBAX;
	}
	public void setA1_IRBAX(String a1_IRBAX) {
		A1_IRBAX = a1_IRBAX;
	}
	public String getA1_MATFUN() {
		return A1_MATFUN;
	}
	public void setA1_MATFUN(String a1_MATFUN) {
		A1_MATFUN = a1_MATFUN;
	}
	public String getA1_OUTRMUN() {
		return A1_OUTRMUN;
	}
	public void setA1_OUTRMUN(String a1_OUTRMUN) {
		A1_OUTRMUN = a1_OUTRMUN;
	}
	public String getA1_TPNFSE() {
		return A1_TPNFSE;
	}
	public void setA1_TPNFSE(String a1_TPNFSE) {
		A1_TPNFSE = a1_TPNFSE;
	}
	public String getA1_ALIFIXA() {
		return A1_ALIFIXA;
	}
	public void setA1_ALIFIXA(String a1_ALIFIXA) {
		A1_ALIFIXA = a1_ALIFIXA;
	}
	public String getA1_CRDMA() {
		return A1_CRDMA;
	}
	public void setA1_CRDMA(String a1_CRDMA) {
		A1_CRDMA = a1_CRDMA;
	}
	public String getA1_PRSTSER() {
		return A1_PRSTSER;
	}
	public void setA1_PRSTSER(String a1_PRSTSER) {
		A1_PRSTSER = a1_PRSTSER;
	}
	public String getA1_RFACS() {
		return A1_RFACS;
	}
	public void setA1_RFACS(String a1_RFACS) {
		A1_RFACS = a1_RFACS;
	}
	public String getA1_RFABOV() {
		return A1_RFABOV;
	}
	public void setA1_RFABOV(String a1_RFABOV) {
		A1_RFABOV = a1_RFABOV;
	}
	public float getA1_PERFECP() {
		return A1_PERFECP;
	}
	public void setA1_PERFECP(float a1_PERFECP) {
		A1_PERFECP = a1_PERFECP;
	}
	public String getA1_IENCONT() {
		return A1_IENCONT;
	}
	public void setA1_IENCONT(String a1_IENCONT) {
		A1_IENCONT = a1_IENCONT;
	}
	public String getA1_TPDP() {
		return A1_TPDP;
	}
	public void setA1_TPDP(String a1_TPDP) {
		A1_TPDP = a1_TPDP;
	}
	public String getA1_TPJ() {
		return A1_TPJ;
	}
	public void setA1_TPJ(String a1_TPJ) {
		A1_TPJ = a1_TPJ;
	}
	public String getD_E_L_E_T_() {
		return D_E_L_E_T_;
	}
	public void setD_E_L_E_T_(String d_E_L_E_T_) {
		D_E_L_E_T_ = d_E_L_E_T_;
	}
	public int getR_E_C_N_O_() {
		return R_E_C_N_O_;
	}
	public void setR_E_C_N_O_(int r_E_C_N_O_) {
		R_E_C_N_O_ = r_E_C_N_O_;
	}
	public int getR_E_C_D_E_L_() {
		return R_E_C_D_E_L_;
	}
	public void setR_E_C_D_E_L_(int r_E_C_D_E_L_) {
		R_E_C_D_E_L_ = r_E_C_D_E_L_;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}