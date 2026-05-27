package exe3;

public class Estadual extends Produto {
    private double imposto; // 10% = 0.10

    public Estadual(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10; // Definido automaticamente conforme enunciado
    }

    @Override
    public double calcularValorFinal() {
        return this.valor + (this.valor * this.imposto);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Produto Estadual");
        System.out.println("Imposto (10%): R$ " + (this.valor * this.imposto));
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}
