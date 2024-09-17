public class Pessoa
{
	private String nome;
	private String sobrenome;
	private String email;
	private int idade;
	private String cpf;
	private String endereco;
	private double altura;
	private String corCabelo;
	private String corOlho;
	private double salario;
	
	Pessoa(String nome, String sobrenome, String email, int idade, String cpf, String endereco, double altura, String corCabelo,
	String corOlho, double salario){
	    this.nome = nome;
	    this.sobrenome = sobrenome;
	    this.email = email;
	    this.idade = idade;
	    this.cpf = cpf;
	    this.endereco = endereco;
	    this.altura = altura;
	    this.corCabelo = corCabelo;
	    this.corOlho = corOlho;
	    this.salario = salario;
	    
	}
	
	public void setnome(String nome){
	    this.nome = nome;
	}
	 public String getNome() {
        return nome;
    }
     public String getSobrenome() {
        return sobrenome;
     }
     public String getEmail() {
        return email;
     }
     public int getIdade() {
        return idade;
     }
     public String getCpf() {
        return cpf;
     }
     public String getEndereco() {
        return endereco;
     }
     public double getAltura() {
        return altura;
     }
     public String getCorCabelo() {
        return corCabelo;
     }
     public String getCorOlho() {
        return corOlho;
     }
     public double getSalario() {
        return salario;
     }
}