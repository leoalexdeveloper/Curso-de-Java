package controle;

import java.util.Scanner;

public class controleIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		
		entrada.close();
	}
}
