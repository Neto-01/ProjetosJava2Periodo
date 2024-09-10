import java.util.ArrayList;

public class Lista2{
    
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Talles");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Joana");
        nomes.add("Vava");
        
        if (nomes.size() > 1){
            nomes.remove(1);
        }
        
        System.out.println("Lista sem o segundo nome:");
        for (String nome : nomes){
            System.out.println(nomes);
        }
        
        if (nomes.size() > 2){
            nomes.remove(2);
        }
        
        System.out.println("\nLista sem o terceiro nome:");
        for (String nome : nomes);
            System.out.println(nomes);
            
        if (nomes.size() > 0 && nomes.get(0).equals("Talles")){
            System.out.println("\nNo primeiro nome é Talles");
        
        } else {
            System.out.println("\nNo primeiro nome não é Talles");
        }
            
    
    }
    
}