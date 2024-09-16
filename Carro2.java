public class Carro2{
    
    public static void main(String[] args){
        
        Carro car = new Carro("Chevrolet");
        
        car.marca = "Chevrolet";
        car.modelo = "Vectra";
        car.ano = 1998;
        car.cor = "Preto";
        car.velocidade = 0;
        car.preco = 22000;
        
          System.out.println("A marca do carro é:"+ " " + car.marca);
          System.out.println("A modelo do carro é:"+ " " + car.modelo);
          System.out.println("O ano do carro é:"+ " " + car.ano);
          System.out.println("A cor do carro é:"+ " " + car.cor);
        
        
        car.vender();
        
        car.comprar();
        
        car.ligar();
    
        car.acelerar(50);
            System.out.println("A velocidade do carro é de:" + " " + car.velocidade + "\n");
            
        car.freiar(30);
            System.out.println("O carro agora está reduzindo, a sua velocidade agora é de:" + " " + car.velocidade + "\n");
            
        car.buzinar();    
        
        car.desligar(); 
        
        Carro uno = new Carro("Fiat", "Uno", 2006);
          System.out.println(uno.marca);
          System.out.println(uno.modelo);
          System.out.println(uno.ano + "\n");
          
        Carro celta = new Carro("Chevrolet", "Celta", 2009);  
          System.out.println(celta.marca);
          System.out.println(celta.modelo);
          System.out.println(celta.ano + "\n");
          
        Carro civic = new Carro("Honda", "CivicSi", 2008, "Preto", 90000);
          System.out.println(civic.marca);
          System.out.println(civic.modelo);
          System.out.println(civic.ano);
          System.out.println(civic.preco);
    }
}