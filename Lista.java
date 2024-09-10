import java.util.ArrayList;

public class Lista{
    
    public static void main(String[] args){

        String[] nomes = new String[10];
        
        nomes[0] = "Bob";
        nomes[1] = "Ze";
        nomes[2] = "Sand";
        nomes[3] = "Patrick";
        nomes[4] = "Joao";
        nomes[5] = "Ana";
        nomes[6] = "Maria";
        nomes[7] = "Junior";
        nomes[8] = "Joana";
        nomes[9] = "Livia";
        
        
        //for (String lista: nomes){
          //  System.out.println(lista);
        //}
        
        for (int i = 3; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
    }
    
    
 
}