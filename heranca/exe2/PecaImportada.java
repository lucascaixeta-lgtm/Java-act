package exe2;

public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    // Construtor padrão PecaImportada()
    public PecaImportada() {
        super();
    }

    // Construtor completo repassando os dados base via super()
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    // Sobrescrita: Preço final = preço base (custo+lucro) + taxas adicionais
    @Override
    public float calcularPreco() {
        return super.calcularPreco() + this.taxaImportacao + this.taxaFrete;
    }

    @Override
    public void exibir() {
        super.exibir(); // Exibe as informações base da peça
        System.out.println("Taxa de Importação: R$ " + taxaImportacao);
        System.out.println("Taxa de Frete Internacional: R$ " + taxaFrete);
        System.out.println("Preço Final com Encargos: R$ " + calcularPreco());
    }
}