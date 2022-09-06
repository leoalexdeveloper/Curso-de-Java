package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FIla {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//peek obtem o proximo elemento da fila sem remover
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.size());
		//System.out.println(fila.clear());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
		System.out.println(fila);
	}
}
