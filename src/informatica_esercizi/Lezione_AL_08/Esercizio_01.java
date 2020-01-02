package informatica_esercizi.Lezione_AL_08;

import static java.lang.System.out;

/**
 * Scrivere un programma StampeInutili che consiste del programma principale e
 * di altre tre procedure con nomi a piacere. Le tre procedure stampano ognuno
 * un messaggio diverso dagli altri (a piacere). Il programma principale invoca
 * le tre procedure una dopo l’altra con il risultato che i tre messaggi vengono
 * visualizzati.
 * 
 * @author Utente
 *
 */
public class Esercizio_01 {

	public static void main(String[] args) {
		stampeInutili1();
		stampeInutili2();
		stampeInutili3();
	}

	private static void stampeInutili1() {
		out.println("stampe inutili 1");
	}

	private static void stampeInutili2() {
		out.println("stampe inutili 2");
	}

	private static void stampeInutili3() {
		out.println("stampe inutili 3");
	}

}
