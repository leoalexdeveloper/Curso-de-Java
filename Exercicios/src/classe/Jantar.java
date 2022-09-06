package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida sanduiche = new Comida("Sanduiche", 0.200);
		Comida pao = new Comida("Pão", 0.349);
		
		Pessoa pessoa1 = new Pessoa("Adalberto", 96.3522);
		Pessoa pessoa2 = new Pessoa("Birrento", 82.879);
		
		pessoa1.comer(pao);
		pessoa1.comer(sanduiche);
		
		pessoa2.comer(pao);
		pessoa2.comer(sanduiche);
		
		System.out.printf("Pessoa 1 pesa depois de comer: %.2f\n", pessoa1.pesar());
		System.out.printf("Pessoa 2 pesa depois de comer: %.2f", pessoa2.pesar());
	}
}
