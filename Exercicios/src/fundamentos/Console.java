package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
	
		System.out.printf("Megasena: %d %d %d %n", 1, 2, 3);
		
		System.out.printf("Salario: R$%.2f%n", 2.0);
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.printf("\n\n%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
		
	}
}
