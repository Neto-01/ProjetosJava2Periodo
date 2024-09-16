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
	
	Pessoa(String nome, String sobrenome){
	    this.nome = nome;
	    this.sobrenome = sobrenome;
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
}