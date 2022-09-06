package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Main {
	public static void main(String[] args) {
		Carro civic = new Civic(5);
		
		Ferrari ferrari = new Ferrari(50);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		civic.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeDoAr());
		
		System.out.println("Civic acelerando a " + civic);
		System.out.println("Ferrari acelerando a " + ferrari);
	}
}
