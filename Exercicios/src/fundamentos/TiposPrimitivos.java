package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações de funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_233L;
		
		//Tipos numericos com ponto flutuante
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*3656);
		
		//Numeros de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
