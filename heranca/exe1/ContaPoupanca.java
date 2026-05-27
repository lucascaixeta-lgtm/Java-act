package exe1;

public class ContaPoupanca extends ContaBancaria {

    private String diaRendimento;
    private double taxaRendimento;

    //Construtor 
    public ContaPoupanca(String cliente, String numeroConta, double saldo, String diaRendimento, double taxaRendimento){
        super(cliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
        this.taxaRendimento = taxaRendimento;
    }

    //metodo (excluisivo da conta poupança)
    public void calcularNovoSaldo(double taxaRendimento){
        double rendimento = this.saldo * taxaRendimento;
        this.saldo += rendimento;
          System.out.println("Novo saldo após rendimento: R$ " + this.saldo);
    }

    @Override
    public void nota(){
        super.nota();
        System.out.println("Dia do Rendimento: " + this.diaRendimento);
        System.out.println("Taxa de Rendimento: " + (this.taxaRendimento * 100) + "%");
    }
}
