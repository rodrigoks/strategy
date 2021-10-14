package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Fedex implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 30 * peso;
	}
	
}
