public class Pessoa2{
    
    public static void main(String[] args){
        
        Pessoa jose = new Pessoa("Jose", "Silva", "Josess@gmail.com", 30, "123.543.456-09", "Rua, zeze", 1.72, "Castanho",
        "Castanho", 5.60490);
        System.out.println(jose.getNome());
        System.out.println(jose.getSobrenome());
        System.out.println(jose.getEmail());
        System.out.println(jose.getIdade());
        System.out.println(jose.getCpf());
        System.out.println(jose.getEndereco());
        System.out.println(jose.getAltura());
        System.out.println(jose.getCorCabelo());
        System.out.println(jose.getCorOlho());
        System.out.println(jose.getSalario() + "\n");
        
        Pessoa joao = new Pessoa("Joao", "Ferreira", "Joaofr@gmail.com", 32, "432.543.456-09", "Rua, Centro", 1.75, "Castanho","Castanho", 6.60490);
        
        System.out.println(joao.getNome());
        System.out.println(joao.getSobrenome());
        System.out.println(joao.getEmail());
        System.out.println(joao.getIdade());
        System.out.println(joao.getCpf());
        System.out.println(joao.getEndereco());
        System.out.println(joao.getAltura());
        System.out.println(joao.getCorCabelo());
        System.out.println(joao.getCorOlho());
        System.out.println(joao.getSalario());
    }
}