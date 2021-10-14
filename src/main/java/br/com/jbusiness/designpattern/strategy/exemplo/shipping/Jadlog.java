package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Jadlog implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 110 * peso;
	}
	
}
