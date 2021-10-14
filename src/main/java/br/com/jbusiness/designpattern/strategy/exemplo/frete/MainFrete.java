package br.com.jbusiness.designpattern.strategy.exemplo.frete;

import java.util.Scanner;

public class MainFrete {
	
	public static void main(String[] args) {
		
		try(Scanner entrada = new Scanner(System.in)){
			
			System.out.print("Informe a distancia: ");
			int distancia = entrada.nextInt();
			System.out.print("Qual o tipo de frete? (1) Normal (2) Secex: ");
			int opcoesFrete = entrada.nextInt();
			
			TipoFrete tipoFrete = TipoFrete.values()[opcoesFrete - 1];
			
			Frete frete = tipoFrete.obterFrete();
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
			
		}
		
	}

}
