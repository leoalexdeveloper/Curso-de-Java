package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double farenheit = 90;
		
		final double celsius = (farenheit - AJUSTE) * FATOR;
		
		System.out.print("Farenheit: "+ farenheit + " = " + celsius + " °C.");
	}
}
