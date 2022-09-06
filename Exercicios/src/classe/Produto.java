package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(String nomeInicial, 
			double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(){
		
	}
	
	
	float precoComDesconto() {
		float resultado = (float) (preco * (1 - desconto));
		return resultado;
	}
}
