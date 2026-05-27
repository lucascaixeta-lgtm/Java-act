package exe1;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    // Construtor
    public ContaEspecial(String cliente, String numeroConta, double saldo, double limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    //Metodos 
    @Override
    public void sacar(double valor) {
        // Calcula o poder de compra total do cliente (Saldo + Limite)
        double limiteMaximoDisponivel = this.saldo + this.limite;

        // VALIDAÇÃO: Verifica se o valor solicitado NÃO ultrapassa o limite estabelecido
        if (valor > 0 && valor <= limiteMaximoDisponivel) {
            // Se estiver tudo certo, permite o saque (o saldo pode ficar negativo)
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na Conta Especial.");
        } else {
            // Se o valor ultrapassar o limite, exibe a mensagem de bloqueio
            System.out.println("Saque recusado! O valor de R$ " + valor + " ultrapassa o limite disponível.");
            System.out.println("Seu saldo atual é: R$ " + this.saldo + " | Seu limite é: R$ " + this.limite);
        }
    }

    // Getters e Setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

     @Override
    public void nota(){
        // Chama o print original da ContaBancaria (Nome, Conta e Saldo)
        super.nota();
        System.out.println("Limite Disponível: R$ " + this.limite);
        System.out.println("Saldo Total Disponível (Saldo + Limite): R$ " + (this.saldo + this.limite));
    }
}





   