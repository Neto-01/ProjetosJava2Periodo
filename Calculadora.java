public class calc {
  public static void main(String[] args){
  
  double valorUm;
  double valorDois;

   public double somar(double valorUm, double valorDois) {
    return valorUm + valorDois; 
  }

   public double subtracao(double valorUm, double valorDois) {
    return valorUm - valorDois;
  }

   public double multiplicacao(double valorUm, double valorDois){
    return valorUm * valorDois;
  }

   public double divisao(double valorUm, double valorDois){
    return valorUm / valorDois;
  }

  public class main{
    public static void main(String[] args){
  
  Calculadora cal = new Calculadora();

        double resultado = cal.soma(10,5);
        System.out.println(resultado);
        
        double resultado2 = cal.substracao(10,5);
        System.out.println(resultado2);

        double resultado3 = cal.multiplicacao(10,5);
        System.out.println(resultado3);

        double resultado4 = cal.divisao(10,5);
        System.out.println(resultado4);
  }
  }

 }

 }