package Principal;

import java.util.Scanner;

import Entidades.Aluno;

public class ControleExerc1 {
	public static void main(String[] args) {
		float[] notas;
		int quantidadeNotas, numeroAluno;
		String nomeAluno;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nomeAluno = lerDados.next();
		
		System.out.println("Informe o número do aluno: ");
		numeroAluno = lerDados.nextInt();
		
		System.out.println("Informe a quantidade de notas do aluno: ");
		quantidadeNotas = lerDados.nextInt();
		notas = new float[quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe o a nota[%d]: ",i);
			notas[i] = lerDados.nextFloat(); 
		}
		
		Aluno aluno = new Aluno(nomeAluno, numeroAluno, notas);
                    System.out.println(aluno.toString());
        
                    lerDados.close();
         }
}