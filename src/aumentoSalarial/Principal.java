package aumentoSalarial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome do funcionario: ");
		funcionario.nome = scanner.nextLine();
		
		System.out.println("Valor do salario: ");
		funcionario.salario = scanner.nextDouble();
		
		System.out.println("\nExibir dados do funcionario: ");
		funcionario.exibirDados();
		
		scanner.close();
	}

}
