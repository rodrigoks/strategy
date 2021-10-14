package br.com.jbusiness.designpattern.strategy.exemplo.shipping;

public class MainFrete {
	
	public static void main(String[] args) {
		
		Frete frete = new Frete(new Sedex());
		System.out.println("Valor Sedex: " + frete.calcular(10));
		frete.setServico(new Pac());
		System.out.println("Valor Pac: " + frete.calcular(10));
		frete.setServico(new Dhl());
		System.out.println("Valor DHL: " + frete.calcular(10));
		frete.setServico(new Fedex());
		System.out.println("Valor Fedex: " + frete.calcular(10));
		frete.setServico(new Jadlog());
		System.out.println("Valor Jadlog: " + frete.calcular(10));
		frete.setServico(new Tnt());
		System.out.println("Valor TNT: " + frete.calcular(10));
		
	}

}
