package Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Digite o número de notas por aluno: ");
		int qtdNotas = entrada.nextInt();
		
		double[][] alunosNotas = new double[qtdAlunos][qtdNotas];
		double media = 0;
		for(int i  = 0; i < qtdAlunos; i++) {
			for(int y = 0; y < qtdNotas; y++) {
				System.out.printf("Digite %s a nota do aluno %d: ", (y+1)+"°",  i+1);
				alunosNotas[i][y] = entrada.nextDouble();
				media += alunosNotas[i][y];
			}			
		}
		
		System.out.printf("\nA média dos %d alunos é %.2f\n", alunosNotas.length, media / (qtdNotas * qtdAlunos));
		
		System.out.println("Notas por aluno:");
		for(double[] notas: alunosNotas) {
			System.out.println(Arrays.toString(notas));
		}
		entrada.close();
	}
}
