package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//Usuario u1 = new Usuario("Ana");
		
//		lista.add(1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
//		lista.remove(1);
//		lista.remove(new Usuario("Manu"));
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem? " + lista.contains(new Usuario("Manu")));
		
		for(Usuario u: lista){
			System.out.println(u.nome);
		}
	}
}
