public class Impressao{

  public static void main(String[] args){
    String nome = "Elefante";

    System.out.println("Tam. da String:" + " " + nome.length());
    System.out.println("String maiúsculo:" + " " + nome.toUpperCase());
    System.out.println("Num. de vogais:" + " " + contarVogais(nome));
  }
  
  public static int contarVogais(String str){
      int count = 0;
      str = str.toLowerCase();
      for (int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
              count ++;
          }
      }
      return count;
  }
  
  
} 