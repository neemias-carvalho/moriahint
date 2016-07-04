package br.com.moriahitg.Pattern;

/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
*/
public class PadraoDeHoras {
	public String converterParaFormatoDeHoras(String hora) {
		String horasConcatenadas = "";
		char[] horaOrganizada = { 0, 0, 0, 0, 0 };
		char[] lista = hora.toCharArray();
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

	public String somaDeHoras(String hora1, String hora2) {
		// Inicializando Strings da hora1 (HH, MM) e hora2 (HH, MM)
		String HHhora1 = "";
		String MMhora1 = "";
		String HHhora2 = "";
		String MMhora2 = "";

		// Inicializando Strings que vão receber horas somadas
		String horaFinalHH = "";
		String horaFinalMM = "";

		// dividindo as strings em partes e adicionando em vetores.
		char[] vetorhora1 = hora1.toCharArray();
		char[] vetorhora2 = hora2.toCharArray();

		// Dividindo os minutos das horas de hora1 e hora2
		HHhora1 = dividirHora(HHhora1, vetorhora1);
		MMhora1 = dividirMinuto(MMhora1, vetorhora1);
		HHhora2 = dividirHora(HHhora2, vetorhora2);
		MMhora2 = dividirMinuto(MMhora2, vetorhora2);

		// Convertendo de String para inteiro: HHhora1, MMhora1, HHhora2 e
		// MMhora2.
		int intHHhora1 = Integer.valueOf(HHhora1);
		int intMMhora1 = Integer.valueOf(MMhora1);
		int intHHhora2 = Integer.valueOf(HHhora2);
		int intMMhora2 = Integer.valueOf(MMhora2);

		// Somar horas (hora1 + hora2) e minutos (minuto1 + minuto2)
		int totalDeHoras = intHHhora1 + intHHhora2;
		int totalDeMinutos = intMMhora1 + intMMhora2;

		// Dividindo os minutos (totalDeMinutos)
		int horasTiradasDosMinutos = totalDeMinutos / 60;
		int minutosTiradosDosMinutos = totalDeMinutos % 60;

		// Somando horasTiradasDosMinutos com totalDeHoras
		totalDeHoras = totalDeHoras + horasTiradasDosMinutos;

		// convertendo novamente para String as horas somadas
		horaFinalHH = Integer.toString(totalDeHoras);
		horaFinalMM = Integer.toString(minutosTiradosDosMinutos);

		// Colocando no formato correto.
		if (horaFinalMM.length() == 1) {
			horaFinalMM = acrescentarZero(horaFinalMM);
		}
		return horaFinalHH + ":" + horaFinalMM;
	}

	public String dividirHora(String hora, char[] vetor) {
		for (int cont = 0; vetor[cont] != ':'; ++cont) {
			hora = hora + vetor[cont];
		}
		return hora;
	}

	public String dividirMinuto(String hora, char[] vetor) {
		String elemento = "";
		for (int cont = 0; cont < vetor.length - 1; ++cont) {
			if (vetor[cont] == ':') {
				elemento = ":";
			}
			if (elemento.equals(":")) {
				hora = hora + vetor[cont + 1];
			}
		}
		return hora;
	}

	public String acrescentarZero(String hora) {
		String resultado = "";
		char[] minutoOrganizado = { 0, 0 };
		char[] lista = hora.toCharArray();
		minutoOrganizado[0] = '0';
		minutoOrganizado[1] = lista[0];
		resultado = String.copyValueOf(minutoOrganizado);
		return resultado;
	}

}