package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
 		System.out.println("Digite o número de alunos: ");
 		
		int numeroNotas = entrada.nextInt();
		
		double[] notasAlunos = new double[numeroNotas];		
		
		for(int i = 0; i < numeroNotas; i++) {
			System.out.printf("Nota aluno %d: ", i+1);
			double novaNota = entrada.nextDouble();
			notasAlunos[i] = novaNota;
		}
		
		int index = 1;
		double acumulador = 0;
		
		for(double nota: notasAlunos) {
			System.out.printf("Aluno %d teve nota: %.2f\n", index , nota);
			acumulador += nota;
			index++;
		}
		
		System.out.printf("A média de notas dos alunos é: %.2f", (acumulador / notasAlunos.length));
		
		entrada.close();
	}
}
