package project;
import java.util.Scanner;
public class Act5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
	       System.out.println("======= MENU DO RESTAURANTE =======");
	       System.out.println("1 - Pizza");
	       System.out.println("2 - Hambúrguer");
	       System.out.println("3 - Salada");
	       System.out.println("4 - Bebida");
	       System.out.println("===================================");
	       System.out.print("Escolha uma opção (digite o nome ou o número): ");
	      
	       String opcao = scan.next().toLowerCase();
	       System.out.println("\n--- Detalhes do Pedido ---");
	       switch (opcao) {
	           case "1":
	           case "pizza":
	               System.out.println("Prato: Pizza Calabresa");
	               System.out.println("Descrição: Molho de tomate, mussarela, calabresa e orégano.");
	               System.out.println("Preço: R$ 45,00");
	               break;    
	           case "2":
	           case "hambúrguer":
	           case "hamburguer":
	               System.out.println("Prato: Super Burger");
	               System.out.println("Descrição: Pão artesanal, carne 180g, queijo cheddar e bacon.");
	               System.out.println("Preço: R$ 32,00");
	               break;  
	           case "3":
	           case "salada":
	               System.out.println("Prato: Salada Caesar");
	               System.out.println("Descrição: Alface americana, croutons, frango grelhado e molho especial.");
	               System.out.println("Preço: R$ 25,00");
	               break;
	           case "4":
	           case "bebida":
	               System.out.println("Opção: Suco Natural de Laranja");
	               System.out.println("Descrição: Suco da fruta fresquinho (500ml).");
	               System.out.println("Preço: R$ 10,00");
	               break;
	           default:
	               System.out.println("Erro: Opção inválida! Escolha um item do menu.");
	               break;
	       }
	       System.out.println("--------------------------");
	       scan.close();

	}

}
