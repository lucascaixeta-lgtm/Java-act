package project;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.println("--- CALCULADORA DE IMC ---");
	      
	       System.out.print("Digite seu peso em kg (ex: 70,5 ou 80): ");
	       double peso = scan.nextDouble();
	      
	       System.out.print("Digite sua altura em centímetros (ex: 175): ");
	       int alturaCm = scan.nextInt();
	      
	       double alturaMetros = (double) alturaCm / 100;
	      
	       double imc = peso / (alturaMetros * alturaMetros);
	      
	       System.out.println("\n----------------------------");
	       System.out.printf("Peso informado: %.1f kg\n", peso);
	       System.out.printf("Altura informada: %d cm (%.2f m)\n", alturaCm, alturaMetros);
	       System.out.printf("Seu IMC final é: %.2f\n", imc);
	       System.out.print("Classificação: ");
	      
	       if (imc < 16) {
	           System.out.println("Magreza grave");
	       } else if (imc < 17) {
	           System.out.println("Magreza moderada");
	       } else if (imc < 18.5) {
	           System.out.println("Magreza leve");
	       } else if (imc < 25) {
	           System.out.println("Saudável");
	       } else if (imc < 30) {
	           System.out.println("Sobrepeso");
	       } else if (imc < 35) {
	           System.out.println("Obesidade Grau I");
	       } else if (imc < 40) {
	           System.out.println("Obesidade Grau II (severa)");
	       } else {
	           System.out.println("Obesidade Grau III (mórbida)");
	       }
	       System.out.println("----------------------------");
	       scan.close();


	}

}
