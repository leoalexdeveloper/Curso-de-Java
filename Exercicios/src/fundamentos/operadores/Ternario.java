package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 4.6;
		String resultadoParcial = media >= 5 ? "RECUPERAÇÃO" : "REPROVADO";
		String resultadoFinal = media >= 7.0 ? "APROVADO" : resultadoParcial;
		
		System.out.println(resultadoFinal);
	}
}
