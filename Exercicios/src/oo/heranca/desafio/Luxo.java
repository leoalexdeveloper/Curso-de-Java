package oo.heranca.desafio;

public interface Luxo {
	public abstract void ligarAr();
	public abstract void desligarAr();
	
	public default int velocidadeDoAr() {
		return 1;
	}
}
