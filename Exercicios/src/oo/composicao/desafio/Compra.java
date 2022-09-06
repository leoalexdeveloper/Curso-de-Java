package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> items = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtd) {
		this.items.add(new Item(p, qtd));
	}
	
	void adicionarItem(String nome, double preco,  int qtd) {
		var produto = new Produto(nome, preco);
		this.items.add(new Item(produto, qtd));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: items) {
			total += item.qtd * item.produto.preco;
		}
		return total;
	}
}
