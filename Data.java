 // tipos de construtor();

package Classe;

public class Data {

	int dia;
	int mes;
        int ano;
   
    Data(){ 
    	dia = 1;
    	mes = 1;
    	ano = 1970;
    	 ///Esse é o construtor padrão
    	}

    Data(int diaInicial, int mesInicial, int anoInicial){
    	dia = diaInicial;
    	mes = mesInicial;
    	ano = anoInicial;
    	
    }
	
}
