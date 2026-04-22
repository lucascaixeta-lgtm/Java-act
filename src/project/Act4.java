package project;
import java.util.Scanner;
public class Act4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.print("Digite o primeiro número: ");
	       double num1 = scan.nextDouble();
	       System.out.print("Digite o segundo número: ");
	       double num2 = scan.nextDouble();
	     
	       System.out.println("Escolha a operação: (+, -, *, /)");
	       String operacao = scan.next();
	       double resultado = 0;
	       boolean operacaoValida = true;
	      
	       switch (operacao) {
	           case "+":
	               resultado = num1 + num2;
	               break;
	           case "-":
	               resultado = num1 - num2;
	               break;
	           case "*":
	               resultado = num1 * num2;
	               break;
	           case "/":
	              
	               if (num2 != 0) {
	                   resultado = num1 / num2;
	               } else {
	                   System.out.println("Erro: Não é possível dividir por zero!");
	                   operacaoValida = false;
	               }
	               break;
	           default:
	               System.out.println("Operação inválida!");
	               operacaoValida = false;
	               break;
	       }
	      
	       if (operacaoValida) {
	           System.out.printf("Resultado: %.2f %s %.2f = %.2f\n", num1, operacao, num2, resultado);
	       }
	       scan.close();


	}

}
