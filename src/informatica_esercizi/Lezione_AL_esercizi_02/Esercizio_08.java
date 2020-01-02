package informatica_esercizi.Lezione_AL_esercizi_02;

import java.util.Scanner;

/**
 * Scrivere un programma che inserisce dei numeri interi casuali (compresi fra
 * un minimo e un massimo) in un vettore (la cui dimensione è fornita
 * dall’utente) e individua gli elementi duplicati, visuallizzandoli sullo
 * schermo.
 * 
 * @author Utente
 *
 */
public class Esercizio_08 {
	private static int MIN = -500;
	private static int MAX = 500;

	public static void main(String[] args) {
		int dim = ottieniDimensione();
		int[] casuali = new int[dim];
		boolean[] duplicati = new boolean[dim];
		caricaDati(casuali, duplicati);
		mostraDati(casuali, duplicati);
	}

	private static void caricaDati(int[] vet, boolean[] dup) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = MIN + (int) ((MAX - MIN + 1) * RANDOM());
			duplicato(vet, dup, i);
		}
	}

	private static boolean duplicato(int[] vet, boolean[] dup, int i) {
		for (int j = 0; j < i; j++) {
			if (vet[i] == vet[j]) {
				return dup[j] = true;
			}
		}
		return false;
	}

	private static void mostraDati(int[] vet, boolean[] dup) {
		System.out.println("Stampa dati del vettore");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dati [" + i + "] = " + vet[i]);
		}
		System.out.println("Stampa duplicati");
		for (int i = 0; i < dup.length; i++) {
			if (dup[i]) {
				System.out.println("Dato duplicato = " + vet[i]);
			}
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
