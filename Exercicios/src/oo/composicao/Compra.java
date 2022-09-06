package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	
	ArrayList<Item> items = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		items.add(item);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: items) {
			total += item.qtd * item.preco;
		}
		return total;
	}
}
