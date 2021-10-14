package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Sedex implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 25 * peso;
	}

	
}
