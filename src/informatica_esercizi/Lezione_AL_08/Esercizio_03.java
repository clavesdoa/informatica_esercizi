package informatica_esercizi.Lezione_AL_08;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Scrivere un programma AnnoBisestile che chiede all’utente di inserire un
 * numero intero che rappresenta un anno, e stampa “Anno bisestile“ se l’anno
 * inserito è bisestile, “Anno non bisestile“ se l’anno inserito non è
 * bisestile, oppure “Errore” se il numero inserito è negativo. Nota: Un anno
 * per essere bisestile deve: a) essere divisibile per 4 b) qualora sia
 * divisibile per 100, deve anche essere divisibile per 400 Realizzare il
 * programma usando una funzione Bisestile(anno) che restituisce true o false a
 * seconda che anno sia bisestile o meno.
 * 
 * @author Utente
 *
 */
public class Esercizio_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			out.println("Inserisci un anno");
			int anno = input.nextInt();
			if (anno < 0) {
				out.println("Errore");
			} else if (Bisestile(anno)) {
				out.println("Anno bisestile");
			} else {
				out.println("Anno non bisestile");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	private static boolean Bisestile(int anno) {
		if (anno % 4 != 0 || (anno % 100 == 0 && anno % 400 != 0)) {
			return false;
		}
		return true;
	}

}
