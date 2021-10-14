package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Dhl implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 50 * peso;
	}
	
}
