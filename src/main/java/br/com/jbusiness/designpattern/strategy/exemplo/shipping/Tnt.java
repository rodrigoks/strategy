package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Tnt implements FreteServico {

	@Override
	public double calcular(double peso) {
		return 87 * peso;
	}
	
}
