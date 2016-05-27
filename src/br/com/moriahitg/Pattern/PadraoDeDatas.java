package br.com.moriahitg.Pattern;

public class PadraoDeDatas {
	
	public String converterParaDataEmPortugues (String ZA_DTINI) {
		String palavrasConcatenadas = "";
		char [] dataOrganizada = {0,0,0,0,0,0,0,0,0,0};
		char [] lista = ZA_DTINI.toCharArray();
		ZA_DTINI = "";
		dataOrganizada[0] = lista[6];
		dataOrganizada[1] = lista[7];
		dataOrganizada[2] = '/';
		dataOrganizada[3] = lista[4];
		dataOrganizada[4] = lista[5];
		dataOrganizada[5] = '/';
		dataOrganizada[6] = lista[0];
		dataOrganizada[7] = lista[1];
		dataOrganizada[8] = lista[2];
		dataOrganizada[9] = lista[3];
		for (char num : dataOrganizada) {
			palavrasConcatenadas += num;
		}
		return palavrasConcatenadas;
	}
}
