package es_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RestoProgramma {
	private int[] array;

	public void run() {
		initializeArray();
		printArray();

		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			numero = readInputNumber(scanner);

			if (numero == 0) {
				break; // Termina il programma se l'utente inserisce 0
			}

			int posizione = readInputPosition(scanner);
			updateArray(numero, posizione);
			printArray();

		} while (numero != 0);

		System.out.println("Programma terminato.");
	}

	private void initializeArray() {
		array = new int[5];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
	}

	private void printArray() {
		System.out.println("Array: " + Arrays.toString(array));
	}

	private int readInputNumber(Scanner scanner) {
		System.out.print("Inserisci un numero (0 per uscire): ");
		return scanner.nextInt();
	}

	private int readInputPosition(Scanner scanner) {
		System.out.print("Inserisci la posizione (0-4): ");
		return scanner.nextInt();
	}

	private void updateArray(int numero, int posizione) {
		try {
			if (posizione < 0 || posizione >= array.length) {
				throw new IndexOutOfBoundsException("Posizione non valida.");
			}
			array[posizione] = numero;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Errore: Posizione non valida.");
		}
	}
}