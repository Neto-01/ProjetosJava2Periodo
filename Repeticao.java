//trabalho de repetição de números usando o while e for
public class Repeticao{

	public static void main(String[] args) {
	    int numero = 1;
	    int numero2 = 1;
	    
	    while(numero <=50){
	        System.out.println("Número ->" + " " + numero);
	        numero++; //essa condicao gera os numeros que apresentam na tela mas tbm gera a condicao false
	    }	
			
		for (int i = 1; i <= 50; i++){
		    System.out.println("Número com for ->" + " " + i);
		}
		
		for (int i = 0; i <= 50; i++){
		    System.out.println("Número pares com for ->" + " " + i );
		    i++;
	    }
	    
	    while(numero2 <=50){
	          if (numero2 % 2 != 0){
	              System.out.println("Número impar com while ->" + " " + numero2);
	          }
	        numero2++;
	    }
}

}