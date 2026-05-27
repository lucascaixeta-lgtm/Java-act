package exe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o valor base do produto: R$ ");
        double valor = scanner.nextDouble();

        Produto produto = null;

        System.out.println("\n--- NÍVEL DE VENDA ---");
        System.out.println("1 - Estadual");
        System.out.println("2 - Nacional");
        System.out.println("3 - Importado");
        System.out.print("Escolha a tributação do produto: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                produto = new Estadual(descricao, valor);
                break;
            case 2:
                produto = new Nacional(descricao, valor);
                break;
            case 3:
                produto = new Importado(descricao, valor);
                break;
            default:
                System.out.println("Opção inválida! Criando como produto base sem taxas.");
                produto = new Produto(descricao, valor);
                break;
        }

        System.out.println("\n==================================");
        System.out.println("        CÁLCULO DE TRIBUTOS       ");
        System.out.println("==================================");
        produto.exibirDados();

        scanner.close();
    }
}
