package informatica_esercizi.Lezione_AL_esercizi_02;

import java.util.Scanner;

/**
 * Scrivere un programma che inserisce dei numeri interi casuali2) (compresi fra
 * 11 e 33) in un vettore (la cui dimensione è fornita dall’utente).
 * Successivamente, scrivere una funzione che effettua il ribaltamento del
 * vettore stesso
 * 
 * @author Utente
 *
 */
public class Esercizio_02 {
	private static int MIN = 11;
	private static int MAX = 33;

	public static void main(String[] args) {
		int dim = ottieniDimensione();
		int[] casuali = new int[dim];
		caricaDati(casuali);
		mostraDati(casuali);
		ribaltamento(casuali);
		mostraDati(casuali);
	}

	private static void ribaltamento(int[] vet) {
		int sinistra = 0;
		int destra = vet.length - 1;
		while (sinistra <= destra) {
			int temp = vet[sinistra];
			vet[sinistra++] = vet[destra];
			vet[destra--] = temp;
		}
	}

	private static void caricaDati(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = MIN + (int) ((MAX - MIN + 1) * RANDOM());
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
