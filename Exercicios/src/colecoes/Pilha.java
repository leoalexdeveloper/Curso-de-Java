package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		livros.push("Marvek Comics");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		
		System.out.println(livros.size());
//		System.out.println(livros.clear());
		System.out.println(livros.isEmpty());
		System.out.println(livros.contains("O pequeno Príncipe"));
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
