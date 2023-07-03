package es_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double kmPercorsi;
		double litriConsumati;

		try {
			System.out.print("Inserisci il numero di km percorsi: ");
			kmPercorsi = scanner.nextDouble();

			System.out.print("Inserisci il numero di litri consumati: ");
			litriConsumati = scanner.nextDouble();

			if (litriConsumati == 0) {
				throw new ArithmeticException("Divisione per zero.");
			}

			double kmPerLitro = kmPercorsi / litriConsumati;
			System.out.println("Consumo: " + kmPerLitro + " km/litro");
		} catch (ArithmeticException e) {
			System.out.println("Errore: Divisione per zero. Impossibile calcolare il consumo.");
		} catch (Exception e) {
			System.out.println("Errore: Input non valido.");
		} finally {
			scanner.close();
		}
	}
}
