package br.com.moriahitg.Pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PadraoDeHoras {
	public String converterParaFormatoDeHoras (String hora) {
		String horasConcatenadas = "";
		char [] horaOrganizada = {0,0,0,0,0};
		char [] lista = hora.toCharArray();
		hora = "";
		horaOrganizada[0] = lista[0];
		horaOrganizada[1] = lista[1];
		horaOrganizada[2] = ':';
		horaOrganizada[3] = lista[2];
		horaOrganizada[4] = lista[3];
		for (char num : horaOrganizada) {
			horasConcatenadas += num;
		}
		return horasConcatenadas;
	}
	
	@SuppressWarnings("deprecation")
	public String somaHoras(String hora1, String hora2) throws ParseException {
        SimpleDateFormat smp = new SimpleDateFormat("HH:mm");
        Date data1 = smp.parse(hora1);
        Date data2 = smp.parse(hora2);
        Date data3 = new Date(data2.getTime());
        data3.setHours(0);
        data3.setMinutes(0);
        data3.setSeconds(0);
        Date resultado = new Date(data1.getTime() + data2.getTime() - data3.getTime());
        String resultadoEmStr = smp.format(resultado);
        return resultadoEmStr;
    }
}
