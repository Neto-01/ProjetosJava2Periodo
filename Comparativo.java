import java.util.Scanner;

public class Comparativo
{
	public static void main(String[] args) {
	    Scanner comparar = new Scanner(System.in);
	    int valor1;
	    int valor2;
	    System.out.println("Digite o 1º valor:");
	    valor1 = comparar.nextInt();
	    System.out.println("Digite o 2º valor:");
	    valor2 = comparar.nextInt();
	    
	    if (valor1 > valor2){
	        System.out.println("O maior valor é:" + " " + valor1);
	    }
	    else if (valor2 > valor1){
	        System.out.println("O maior valor é:" + " " + valor2);
	    }
	    
	    comparar.close();
	}
}
