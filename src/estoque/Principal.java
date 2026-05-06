package estoque;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		produto.nome = scanner.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		produto.preco = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		produto.quantidade = scanner.nextInt();
		
		System.out.println("\nDados do Produto:");
		produto.exibirDados();
		
		//
		
		System.out.println("\nDigite a quantidade para add");
		int quantidadeAdicionar = scanner.nextInt();
		produto.entradaEstoque(quantidadeAdicionar);
		System.out.println("\\nDados do produto após a entrada do estoque");
		produto.exibirDados();
		
		//
		
		System.out.println("\nDigite a quantidade para remover");
		int quabtidadeRemover = scanner.nextInt();
		produto.saidaEstoque(quabtidadeRemover);
		System.out.println("\\nDados do produto após a retirada do estoque");
		produto.exibirDados();
		
		scanner.close();
	}

}
