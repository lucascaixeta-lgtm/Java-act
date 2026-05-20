/*
1 - Escreva um programa em Java para criar uma classe chamada Pessoa com 
variáveis de instância privadas nome, idade e país. Forneça métodos públicos 
getter e setter para acessar e modificar essas variáveis a partir da classe principal. 

• Classe Pessoa 
    o Atributos privados 
        § Nome 
        § Idade 
        § País 
    o Métodos públicos 
        § Getters e setters  
    o Classe Principal 
        § Adicionar ou alterar informações dos atributos privados 

*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite o nome da pessoa:");
        String nome = scan.nextLine();
        pessoa1.setNome(nome);

        System.out.println("Digite a idade da pessoa:");
        int idade = scan.nextInt();
        pessoa1.setIdade(idade);

        scan.nextLine();

        System.out .println("Digite o país da pessoa:");
        String pais = scan.nextLine();
        pessoa1.setPais(pais);        
        
        pessoa1.exibirInformacoes();

        scan.close();
    }
}