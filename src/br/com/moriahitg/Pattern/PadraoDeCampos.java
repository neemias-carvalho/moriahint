package br.com.moriahitg.Pattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PadraoDeCampos {
	
	public boolean formatoCorretoA1_COD (String palavra) {
		String cod = "\\d\\d\\d\\d\\d\\d";
		return palavra.matches(cod);
	}
	
	public boolean formatoCorretoDATA (Date data) {
		String formatoDedata = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataS = format.format(data);
		return dataS.matches(formatoDedata);
	}
}