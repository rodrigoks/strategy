package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Pac implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 10 * peso;
	}
	
}
