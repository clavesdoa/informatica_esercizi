package informatica_esercizi.Lezione_AL_esercizi_02;

import java.util.Scanner;

/**
 * Scrivere un programma che inserisce dei numeri interi casuali2) (compresi fra
 * un minimo e un massimo) in un vettore (la cui dimensione è fornita
 * dall’utente) secondo la seguente regola: l i numeri pari devono essere
 * inseriti a partire dalla prima cella libera a sinistra; l i numeri dispari
 * devono essere inseriti a partire dalla prima cella libera a destra.
 * 
 * @author Utente
 *
 */
public class Esercizio_01 {

	private static int MIN = -50;
	private static int MAX = 50;

	public static void main(String[] args) {
		int dim = ottieniDimensione();
		int[] casuali = new int[dim];
		int sinistra = 0;
		int destra = dim - 1;
		while (sinistra <= destra) {
			int casuale = MIN + (int) ((MAX - MIN + 1) * RANDOM());
			if (casuale % 2 == 0) {
				casuali[sinistra++] = casuale;
			} else {
				casuali[destra--] = casuale;
			}
		}
		mostraDati(casuali);
	}

	private static void mostraDati(int[] vet) {
		System.out.println("Stampa dati del vettore");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dati [" + i + "] = " + vet[i]);
		}
	}

	private static int ottieniDimensione() {
		Scanner input = new Scanner(System.in);
		try {
			int dim;
			do {
				System.out.println("Inserisci il numero di numeri da generare: ");
				dim = input.nextInt();
			} while (dim <= 0);
			return dim;
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	private static double RANDOM() {
		return Math.random();
	}
}