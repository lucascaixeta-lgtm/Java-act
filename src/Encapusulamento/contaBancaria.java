package Encapusulamento;

public class contaBancaria {
    
    //atributos privados
    private String titular;
    private int numeroConta;
    private double saldo;

    //construtor 
    public contaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    //metodos publicos (modificadores = encapusulamento)

        //metodo set - inserir e validar os dados 
    public void setTitular(String titular){
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else{
            System.out.println("Nome inválido");
        }
    }


        //busca o dado armazanado na variavel 
    public String getTitular(){
        return titular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

        // metodo para o comportamento da classe
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso");
        } else{
            System.out.println("Valor inválido para depositar");
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
        }
        else if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valor;
            System.out.println("Saque ralizado com sucesso");
        }
    }

    public void exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
