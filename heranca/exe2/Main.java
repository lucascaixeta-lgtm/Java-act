package exe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da peça: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o custo da peça: R$ ");
        float custo = scanner.nextFloat();

        System.out.print("Digite o lucro pretendido: R$ ");
        float lucro = scanner.nextFloat();

        System.out.println("\nA peça é nacional ou importada?");
        System.out.println("1 - Nacional");
        System.out.println("2 - Importada");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        Peca pecaEcolhida = null;

        if (opcao == 1) {
            pecaEcolhida = new Peca(nome, custo, lucro);
        } else if (opcao == 2) {
            System.out.print("Digite o valor da taxa de importação: R$ ");
            float taxaImportacao = scanner.nextFloat();
            
            System.out.print("Digite o valor da taxa de frete: R$ ");
            float taxaFrete = scanner.nextFloat();

            pecaEcolhida = new PecaImportada(nome, custo, lucro, taxaImportacao, taxaFrete);
        } else {
            System.out.println("Opção inválida! Instanciando como peça nacional padrão.");
            pecaEcolhida = new Peca(nome, custo, lucro);
        }

        System.out.println("\n==================================");
        System.out.println("        DETALHES DO PRODUTO       ");
        System.out.println("==================================");
        pecaEcolhida.exibir();

        scanner.close();
    }
}