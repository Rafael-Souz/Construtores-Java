package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		//a1.dia = 4;
		//a1.mes = 2;
		//a1.ano = 2021;
		
		var d2 = new Data(31, 12, 2020);
		//a2.dia = 4;
		//a2.mes = 3;
		//a2.ano = 2022;
		
		System.out.printf("Data: %d/%d/%d \n",d1.dia, d1.mes, d1.ano );
		System.out.printf("Data: %d/%d/%d",d2.dia, d2.mes, d2.ano );
		
	}

}
