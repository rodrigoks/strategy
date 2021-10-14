package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class Frete {

	private FreteServico servico;
	
	public Frete(FreteServico servico) {
		this.servico = servico;
	}
	
	public double calcular(double peso) {
		return this.servico.calcular(peso);
	}

	/**
	 * @param servico the servico to set
	 */
	public void setServico(FreteServico servico) {
		this.servico = servico;
	}
	
}
