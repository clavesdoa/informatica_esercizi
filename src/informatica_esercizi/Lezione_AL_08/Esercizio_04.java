package informatica_esercizi.Lezione_AL_08;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Scrivere un programma CheGiorno che chiede all’utente di inserire: l un
 * valore tra 0 e 6 (da Domenica a Sabato) che rappresenta il giorno del 1
 * gennaio l una data dello stesso anno in formato “gg mm” (es. 22 10 per il 22
 * ottobre) Il programma calcola e stampa che giorno corrisponde alla data
 * inserita dall’utente.
 * 
 * @author Utente
 *
 */
public class Esercizio_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			out.println("Che giorno era il 1 gennaio? [0=Dom...6=Sab]");
			int giorno_1gen = input.nextInt();
			if (giorno_1gen < 0 || giorno_1gen > 6) {
				out.println("Giorno non valido");
				return;
			}
			out.println("Inserisci la data di cui vuoi sapere il giorno");
			int giorno = Integer.valueOf(input.next());
			int mese = Integer.valueOf(input.next());
			if (!DataOk(giorno, mese)) {
				out.println("Data non valida");
				return;
			}
			int giorno_data = (giorno_1gen + (GiorniTrascorsi(giorno, mese) % 7)) % 7;
			StampaGiorno(giorno_data);
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	private static int GiorniDelMese(int mm) {
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return -1;
		}
	}

	private static boolean DataOk(int gg, int mm) {
		return 1 <= gg && gg <= GiorniDelMese(mm);
	}

	private static int GiorniTrascorsi(int gg, int mm) {
		int trascorsi = 0;
		for (int i = 1; i < mm; i++) {
			trascorsi += GiorniDelMese(i);
		}
		trascorsi += gg - 1;
		return trascorsi;
	}

	private static void StampaGiorno(int g) {
		switch (g) {
		case 0:
			out.println("Domenica");
			break;
		case 1:
			out.println("Lunedi'");
			break;
		case 2:
			out.println("Martedi'");
			break;
		case 3:
			out.println("Mercoledi'");
			break;
		case 4:
			out.println("Giovedi'");
			break;
		case 5:
			out.println("Venerdi'");
			break;
		case 6:
			out.println("Sabato");
			break;
		default:
			out.println("Errore!!!");
			break;
		}
	}

}
