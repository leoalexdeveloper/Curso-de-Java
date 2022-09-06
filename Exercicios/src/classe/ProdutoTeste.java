package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto.desconto = 0.59;
		Produto p1 = new Produto("Notebook", 100);

		var p2 = new Produto("Caneta Preta", 2.0);

		System.out.println(p2.nome);
		System.out.println(p1.precoComDesconto());
	}
}
