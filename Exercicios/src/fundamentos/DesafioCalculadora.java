package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		String operacoes = "+-%*/";
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Digite o primeiro número: ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Digite a operação desejada: ");
		String operacao = entrada.next();
		
		double resultado = (operacao.equals("+")) ? resultado = valor1 + valor2 : 0;
		resultado = (operacao.equals("-")) ? resultado = valor1 - valor2 : resultado;
		resultado = (operacao.equals("*")) ? resultado = valor1 * valor2 : resultado;
		resultado = (operacao.equals("/")) ? resultado = valor1 / valor2 : resultado;
		resultado = (operacao.equals("%")) ? resultado = valor1 % valor2 : resultado;
	
		System.out.printf("%.2f %s %.2f = %s",valor1, operacao, valor2, resultado);
		
		entrada.close();
	}
}
