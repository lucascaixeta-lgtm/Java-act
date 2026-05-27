package exe1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 1. Coleta de dados comuns (Toda conta precisa)
        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        // Variável de referência genérica para podermos usar o polimorfismo no menu
        ContaBancaria conta = null;

        // 2. Switch Case para escolher o tipo de conta
        System.out.println("\n--- SELEÇÃO DE CONTA ---");
        System.out.println("1 - Conta Especial");
        System.out.println("2 - Conta Poupança");
        System.out.print("Escolha o tipo de conta: ");
        int tipoConta = scanner.nextInt();

        switch (tipoConta) {
            case 1:
                System.out.print("Digite o limite da Conta Especial: R$ ");
                double limite = scanner.nextDouble();
                // Cria especificamente uma ContaEspecial
                conta = new ContaEspecial(cliente, numeroConta, 0.0, limite);
                break;
                
            case 2:
                scanner.nextLine(); // Limpa o buffer do teclado
                System.out.print("Digite o dia de rendimento da Poupança: ");
                String diaRendimento = scanner.nextLine();
                System.out.print("Digite a taxa de rendimento (ex: 0.05 para 5%): ");
                double taxa = scanner.nextDouble();
                // Cria especificamente uma ContaPoupanca
                conta = new ContaPoupanca(cliente, numeroConta, 0.0, diaRendimento, taxa);
                break;
                
            default:
                System.out.println("Opção inválida! Criando uma conta padrão sem benefícios.");
                conta = new ContaBancaria(cliente, numeroConta, 0.0);
                break;
        }

        // 3. Menu Operacional (Funciona igual para qualquer conta escolhida)
        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("0 - Sair e ver extrato");
            System.out.println("1 - Realizar um depósito");
            System.out.println("2 - Realizar um saque");
            
            // Opção extra exclusiva caso ele tenha escolhido Conta Poupança
            if (conta instanceof ContaPoupanca) {
                System.out.println("3 - Aplicar rendimento mensal");
            }

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do depósito: R$ ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
                opcao = 0; // Finaliza o laço para exibir a nota

            } else if (opcao == 2) {
                System.out.print("Digite o valor que quer sacar: R$ ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
                opcao = 0; // Finaliza o laço para exibir a nota
                
            } else if (opcao == 3 && conta instanceof ContaPoupanca) {
                System.out.print("Confirme a taxa de rendimento atual para aplicar: ");
                double taxaAplicada = scanner.nextDouble();
                // Faz o "cast" para o Java saber que nesta linha a conta é uma poupança
                ((ContaPoupanca) conta).calcularNovoSaldo(taxaAplicada);
                opcao = 0; // Finaliza o laço para exibir a nota
            }

        } while (opcao != 0);

        // 4. Exibe apenas os dados correspondentes à conta escolhida
        System.out.println("\n=== EXTRATO BANCÁRIO ===");
        conta.nota(); 
        
        scanner.close(); 
    }
}
