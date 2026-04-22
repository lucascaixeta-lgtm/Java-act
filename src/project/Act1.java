package project;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite a quantidade de anos completos em serviço:");
		int tempoServico = scan.nextInt();
		
		System.out.println("valor do salario");
		double salario = scan.nextInt();
		
		double bonus;
		
		if(tempoServico > 5){
			bonus = 0.05;
		}
		else{
			bonus = 0.013;
		}
		
		double valorBonus = salario * bonus;
		double salarioAtualizado = salario + valorBonus;
		
		System.out.println("\n--- Resumo do Reajuste ---");
		System.out.println("Tempo de serviço: " + tempoServico + " anos");
		System.out.println("Salário antigo: R$ " + salario);
		System.out.println("Valor líquido do bônus: R$ " + valorBonus);
		System.out.println("Novo salário: R$ " + salarioAtualizado);
		
		scan.close();


	}

}
