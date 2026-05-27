package exe3;

public class Nacional extends Produto {
    private double imposto; // 10% = 0.10
    private double taxa;    // 5% = 0.05

    public Nacional(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10;
        this.taxa = 0.05;
    }

    @Override
    public double calcularValorFinal() {
        return this.valor + (this.valor * this.imposto) + (this.valor * this.taxa);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Produto Nacional");
        System.out.println("Imposto (10%): R$ " + (this.valor * this.imposto));
        System.out.println("Taxa (5%): R$ " + (this.valor * this.taxa));
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}
