package it.dstech.service;

public class Service {
	private double primoNumero;
	private double secondoNumero;
	private String sceltaOperazione;

	public Service(double primoNumero, double secondoNumero, String sceltaOperazione) {
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
		this.sceltaOperazione = sceltaOperazione;
	}
	public double addizione() {
		double somma= primoNumero + secondoNumero;
		return somma;
	}
	public double sottrazione() {
		double differenza= primoNumero - secondoNumero;
		return differenza;
		
	}
	public double moltiplicazione() {
		double prodotto= primoNumero * secondoNumero;
		return prodotto;
		
	}
	public double divisione() {
		double quoziente= primoNumero/secondoNumero;
		return quoziente;
		
	}

}
