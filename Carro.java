public class Carro{

    String marca;
    String modelo;
    int ano;
    String cor;
    double preco;
    boolean isLigado;
    int velocidade;
    String tipoCombustivel;
    //esses atributos sao para teste:
    private int numeroChassis;
    private int debito;


    Carro(String marca){
        this.marca = marca;
    }

    Carro(String marca1, String modelo1, int ano1){
        this.marca = marca1;
        this.modelo = modelo1;
        this.ano = ano1;
        
    }
    
    Carro(String marca2, String modelo2, int ano2, String cor2){
        this.marca = marca2;
        this.modelo = modelo2;
        this.ano = ano2;
        this.cor = cor2;
    }
    
    Carro(String marca3, String modelo3, int ano3, String cor3, int preco3){
        this.marca = marca3;
        this.modelo = modelo3;
        this.ano = ano3;
        this.cor = cor3;
        this.preco = preco3;
    }


    //metodo
     void vender(){
        System.out.println("O preço do carro é de:" + " " + preco + "\n");
    }
    
    void comprar(){
        System.out.println("Comprei o carro\n");
    }
    
    void ligar(){
       isLigado = true;
       System.out.println("O carro está ligado\n");
    }
    
    void acelerar(int aceleracao){
        velocidade+= aceleracao;
    }
    
    void freiar(int reduzir){
        velocidade-= reduzir;
    }    
    
    void buzinar(){
        System.out.println("bibbibibi\n");
    }
    
    void desligar(){
        isLigado = false;
        System.out.println("O carro está desligado.\n");
    }
    
}    
    