package Principal;

import java.util.Scanner;

import Entidades.Venda;

public class Controle {

	public static void main(String[] args) {
		int Pparcelas;
		int Nvenda, Nparcelas, Pre�os, total;
		String nome = null, ModeloCarro;
		
		Scanner lerdados = new Scanner (System.in);
		System.out.println("Informe o nome do vendedor: ");
		nome = lerdados.next();
		
		System.out.println("Informe o numero da venda: ");
		Nvenda = lerdados.nextInt();
		
		System.out.println("Informe o modelo do carro: ");
		ModeloCarro = lerdados.next();
		
		System.out.println("informe o pre�o da venda: ");
		Pre�os = lerdados.nextInt();
		
		System.out.println("Informe o numero de parcelas desejado: ");
		Nparcelas = lerdados.nextInt();
		
		total = Pre�os / Nparcelas;
		System.out.println("O valor de cada parcela �: "+ total);
		Pparcelas = total;
		
		System.out.println("Nome do Vendedor " + nome);
		System.out.println("Numero de Venda :" + Nvenda);
		System.out.println("Modelo do carro: " + ModeloCarro);
		System.out.println("Pre�o do Carro: " + Pre�os);
		System.out.println("Numero de parcelas: " + Nparcelas);
		System.out.println("Pre�o de cada Parcela: " + Pparcelas);
			lerdados.close();
	}

}