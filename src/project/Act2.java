package project;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.println("Digite o lado A:");
	       double a = scan.nextDouble();
	       System.out.println("Digite o lado B:");
	       double b = scan.nextDouble();
	       System.out.println("Digite o lado C:");
	       double c = scan.nextDouble();
	      
	       if (a + b > c && a + c > b && b + c > a) {
	          
	           System.out.print("Os valores formam um triângulo ");
	          
	           if (a == b && b == c) {
	              
	               System.out.println("EQUILÁTERO.");
	              
	           } else if (a == b || a == c || b == c) {
	              
	               System.out.println("ISÓSCELES.");
	              
	           } else {
	              
	               System.out.println("ESCALENO.");
	           }
	       } else {
	           System.out.println("Os valores informados NÃO podem formar um triângulo.");
	       }
	       scan.close();


	}

}
