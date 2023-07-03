package es_3;

public class ContoOnline extends ContoCorrente {
	double maxPrelievo;

	ContoOnline(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	@Override
	public void stampaSaldo() {
		super.stampaSaldo();
		System.out.println("Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x <= maxPrelievo) {
			super.preleva(x);
		} else {
			throw new BancaException("Il prelievo non è disponibile.");
		}
	}
}