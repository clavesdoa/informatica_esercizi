package informatica_esercizi;

/**
 * Riscrivere il programma StampeInutili uJlizzando un’unica procedura che viene
 * chiama tre volte dal programma principale che gli passa (in un parametro
 * aKuale) il testo del messaggio da visualizzare
 * 
 * @author Utente
 *
 */
public class Esercizio_02 {

	public static void main(String[] args) {
		stampeInutili("stampe inutili 1");
		stampeInutili("stampe inutili 2");
		stampeInutili("stampe inutili 3");
	}

	private static void stampeInutili(String stampa) {
		System.out.println(stampa);
	}

}
