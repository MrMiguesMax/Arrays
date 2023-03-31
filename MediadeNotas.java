package dados3_1;

import java.util.Scanner;

public class MediadeNotas {

	public static void main(String[] args) {
		int tamanho=0, atividades=0;
		
		Scanner lerDados = new Scanner (System.in);
		
		System.out.println("Informe o numero de alunos que fizeram as atividades: ");
		tamanho = lerDados.nextInt();
		System.out.println("Informe o numero de atividaes: ");
		atividades = lerDados.nextInt();
		float[][] media = new float[tamanho][atividades];
		for(int i=0; i<media.length; i++) {
			for(int j=0; j<media[0].length; j++) {
				System.out.printf("Informe as notas[%d]:",j);
				media[i][j]=lerDados.nextFloat();
			}
		}
		float calc=0;
		for(int l=0; l<tamanho; l++) {
			for(int t=0; t<atividades; t++) {
				calc = (media[l][t]+media[l][t])/atividades;
			}
			System.out.println("A media e de: "+ calc/2);	
		}
		int total = (int) (calc + calc);
		System.out.println(total);
		float sala = 0;
		for(int m=0; m<calc; m++) {
			for(int y=0; y<tamanho; y++) {
				sala = (media[m][y]+media[m][y])/tamanho;
			}
			System.out.println(sala);
		}
		lerDados.close();
	}

}