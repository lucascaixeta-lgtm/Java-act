package exe3;

public class Produto {
    protected String descricao;
    protected double valor;

    // Construtor
    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Método base para calcular o valor final (será sobrescrito)
    public double calcularValorFinal() {
        return this.valor; 
    }

    // Método para exibir dados comuns
    public void exibirDados() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Base: R$ " + valor);
    }
}
