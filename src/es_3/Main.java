package es_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
			ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500.0);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());

			System.out.print("Inserisci l'importo da prelevare per conto1: ");
			double importo1 = scanner.nextDouble();
			conto1.preleva(importo1);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());

			conto2.stampaSaldo();

			System.out.print("Inserisci l'importo da prelevare per conto2: ");
			double importo2 = scanner.nextDouble();
			conto2.preleva(importo2);

			conto2.stampaSaldo();
		} catch (BancaException e) {
			System.out.println("Errore durante l'operazione: " + e);
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
