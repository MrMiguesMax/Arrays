package Principal;

import java.util.Scanner;

import Entidades.Venda;

public class Controle {

	public static void main(String[] args) {
		int Pparcelas;
		int Nvenda, Nparcelas, Preços, total;
		String nome = null, ModeloCarro;
		
		Scanner lerdados = new Scanner (System.in);
		System.out.println("Informe o nome do vendedor: ");
		nome = lerdados.next();
		
		System.out.println("Informe o numero da venda: ");
		Nvenda = lerdados.nextInt();
		
		System.out.println("Informe o modelo do carro: ");
		ModeloCarro = lerdados.next();
		
		System.out.println("informe o preço da venda: ");
		Preços = lerdados.nextInt();
		
		System.out.println("Informe o numero de parcelas desejado: ");
		Nparcelas = lerdados.nextInt();
		
		total = Preços / Nparcelas;
		System.out.println("O valor de cada parcela é: "+ total);
		Pparcelas = total;
		
		System.out.println("Nome do Vendedor " + nome);
		System.out.println("Numero de Venda :" + Nvenda);
		System.out.println("Modelo do carro: " + ModeloCarro);
		System.out.println("Preço do Carro: " + Preços);
		System.out.println("Numero de parcelas: " + Nparcelas);
		System.out.println("Preço de cada Parcela: " + Pparcelas);
			lerdados.close();
	}

}