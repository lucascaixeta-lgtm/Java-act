package exe1;

public class ContaBancaria {

    // Atributos
    protected String cliente;
    protected String numeroConta;
    protected double saldo;

    // Construtor
    public ContaBancaria(String cliente, String numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    // Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    // Métodos (comportamentos)
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    // Método sacar modificado para aceitar reduções que resultem em saldo negativo
    public void sacar(double valor){
        if(valor > 0){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        }
    }

    // Adicionado dois pontos ":" para melhorar a renderização visual do texto
    public void nota(){
        System.out.println("Titular: " + cliente);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$ " + saldo);    
    }
}
