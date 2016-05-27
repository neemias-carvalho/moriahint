package br.com.moriahitg.Pattern;

public class PadraoDeCampos {
	
	boolean valida;
	
	public boolean formatoCorretoA1_COD (String palavra) {
		String cep = "\\d\\d\\d\\d\\d\\d";
		return valida = palavra.matches(cep);
	}
}