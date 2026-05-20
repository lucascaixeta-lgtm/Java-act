public class Pessoa {

    private String nome;
    private int idade;
    private String pais;

    public Pessoa(String nome, int idade, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.pais = pais;
    }

    public Pessoa(){

    }

    // métodos getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getPais(){
        return pais;
    }

    // métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("País: " + pais);
    }

}