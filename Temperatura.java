import java.util.Scanner;


public class Temperatura{
      
      public static void main(String[] args){
          Scanner termometro = new Scanner(System.in);
          int temp;
          System.out.println("Digite a temperatura:");
          temp = termometro.nextInt();
          
          if (temp >= 30) {
              System.out.println("O clima está quente!");
          }
          else if (temp >=20 && temp <=29){
              System.out.println("Está um clima agradável!");
          }
          else {
              System.out.println("O clima está frio!");
          }
          
          termometro.close();
      }
  }