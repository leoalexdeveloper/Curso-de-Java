package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		imprimir.accept(p1);
		
		Produto p2 = new Produto("CAderno", 12.34, 0.49);
		Produto p3 = new Produto("Borracha", 123.34, 0.29);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
