package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Jogador Heroi = new Heroi(10, 10);
		
		Jogador Monstro = new Monstro(10, 11);
		
		System.out.println("Heroi tem ==> " + Heroi.vida + " vida.");
		System.out.println("Monstro tem ==> " + Monstro.vida + " vida.");
		
		Heroi.atacar(Monstro);
		Monstro.atacar(Heroi);
		
		Heroi.atacar(Monstro);
		Monstro.atacar(Heroi);
	
		Monstro.andar(Direcao.NORTE);
		Heroi.atacar(Monstro);
		Monstro.atacar(Heroi);
		
		Heroi.atacar(Monstro);
		Monstro.atacar(Heroi);
		
		System.out.println("Heroi tem ==> " + Heroi.vida + " vida.");
		System.out.println("Monstro tem ==> " + Monstro.vida + " vida.");
	}
}
