package informatica_esercizi.Lezione_AL_esercizi_02;

import java.util.Scanner;

/**
 * Scrivere un programma che inserisce dei numeri interi casuali (compresi fra
 * un minimo e un massimo) in un vettore (la cui dimensione è fornita
 * dall’utente), garantendo che i numeri caricati nel vettore siano in senso
 * crescente.
 * 
 * @author Utente
 *
 */
public class Esercizio_09 {
	private static int MIN = -500;
	private static int MAX = 500;

	public static void main(String[] args) {
		int dim = ottieniDimensione();
		int[] casuali = new int[dim];
		caricaDati(casuali);
		mostraDati(casuali);
	}

	private static void caricaDati(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			int casuale = MIN + (int) ((MAX - MIN + 1) * RANDOM());
			for (int j = 0; j < i; j++) {
				if (casuale < vet[j]) {
					int temp = vet[j];
					vet[j] = casuale;
					casuale = temp;
				}
			}
			vet[i] = casuale;
		}
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
