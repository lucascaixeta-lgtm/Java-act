package resolverSala;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		aluno.nome = scanner.nextLine();
		
		do {
		System.out.println("Nota do primeiro semestre: ");
		aluno.NotaPrimeiro = scanner.nextDouble();
		}while(aluno.NotaPrimeiro < 0 || aluno.NotaSegundo > 30);
		
		System.out.println("Nota do segundo semestre: ");
		aluno.NotaSegundo = scanner.nextDouble();
			
		System.out.println("Nota do terceiro semestre: ");
		aluno.NotaTerceiro = scanner.nextDouble();
		
		
		System.out.println("\n Exibir notas do aluno:");
		aluno.exibirDados();
		
		
		scanner.close();
	}

}
