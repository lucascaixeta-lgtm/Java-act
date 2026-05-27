package exe2;

public class Peca {
    protected String nome;
    protected float custo;
    protected float lucro;

    // Construtor padrão exigido pelo diagrama Peca()
    public Peca() {
    }

    // Construtor completo
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    // Calcula o preço base: custo + lucro
    public float calcularPreco() {
        return this.custo + this.lucro;
    }

    // Exibe os dados na tela
    public void exibir() {
        System.out.println("Peça: " + nome);
        System.out.println("Custo de Fabricação: R$ " + custo);
        System.out.println("Margem de Lucro: R$ " + lucro);
        System.out.println("Preço Base Total: R$ " + calcularPreco());
    }
}