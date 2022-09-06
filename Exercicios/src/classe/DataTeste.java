package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data newDate1 = new Data();
		Data newDate2 = new Data(1,2,2022);
		
		System.out.println(newDate1.obterDataFormatada());
		System.out.println(newDate2.obterDataFormatada());
	}
}
