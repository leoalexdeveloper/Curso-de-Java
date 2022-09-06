package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
		double notas = 0.0;
		double nota = 0;
		
		while(nota != -1) {
			
			System.out.print("Digita a nota do aluno: ");
			nota = entrada.nextDouble();
			if(nota != -1) {
				notas += nota;
				contador++;
			}else {
				contador--;
			}
		}
		
		double media = notas / contador;
		System.out.printf("A média dos %d alunos é: %s", contador, Double.toString(media).replace(",", "."));
		
//		for(String i = "#"; !i.equals("#######"); i += "#") {
//			System.out.println(i);
//		}
//		
		entrada.close();
	}
}
