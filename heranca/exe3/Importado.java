package exe3;

public class Importado extends Produto {
    private double imposto;        // 10% = 0.10
    private double taxa;           // 5% = 0.05
    private double taxaImportacao; // 5% = 0.05

    public Importado(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10;
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
    }

    @Override
    public double calcularValorFinal() {
        return this.valor + (this.valor * this.imposto) + (this.valor * this.taxa) + (this.valor * this.taxaImportacao);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Produto Importado");
        System.out.println("Imposto (10%): R$ " + (this.valor * this.imposto));
        System.out.println("Taxa (5%): R$ " + (this.valor * this.taxa));
        System.out.println("Taxa de Importação (5%): R$ " + (this.valor * this.taxaImportacao));
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}
