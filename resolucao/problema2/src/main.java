/*
2 - Escreva um programa em Java para criar uma classe chamada Retangulo com 
as variáveis de instância privadas comprimento e largura. Forneça métodos 
públicos getter e setter para acessar e modificar essas variáveis. 
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();


        // entrada de dados
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scan.nextDouble();
        retangulo.setComprimento(comprimento);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scan.nextDouble();
        retangulo.setLargura(largura);

        // exibir as dimensões do retângulo
        System.out.println("Dimensões do Retângulo:");
        retangulo.exibirDimensoes();
        
        scan.close();
    }   
}