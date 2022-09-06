package fundamentos;

import java.util.Scanner;

public class ConversaoString {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String value1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o segundo salário: ");
		String value2 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o terceiro salário: ");
		String value3 = entrada.next().replace(",", ".");
		
		double media = (Double.parseDouble(value1) + Double.parseDouble(value2) + Double.parseDouble(value3)) / 3;		
		System.out.printf("A média do salário é: %s", media);
		
		entrada.close();
	}
}
