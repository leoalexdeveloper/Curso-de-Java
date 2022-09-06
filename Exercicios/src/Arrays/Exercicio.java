package Arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunosA = new double[3];
		notasAlunosA[0] = 10.0;
		notasAlunosA[1] = 9.0;
		notasAlunosA[2] = 7.0;
		
		String a = Arrays.toString(notasAlunosA);
		System.out.println(a);
		
		double totalALunoA = 0;
		for(int i = 0; i < notasAlunosA.length; i++) {
			totalALunoA += notasAlunosA[i];
		}
		
		System.out.println(totalALunoA / notasAlunosA.length);
		
		double[] notasAlunosB = {9.8, 8.9, 7.0, 6.9, 0.0};
		
		//double totalAlunosB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			
		}
		System.out.println(Arrays.toString(notasAlunosB));
	}
}
