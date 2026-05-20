/* 
3 - Escreva um programa em Java para criar uma classe chamada Funcionario com 
as variáveis de instância privadas idFuncionario, nomeFuncionario e 
salarioFuncionario. Forneça métodos públicos getter e setter para acessar e 
modificar as variáveis id e nome, mas forneça apenas um método getter para a 
variável salario, que deve retornar uma string formatada. 
*/

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();


        System.out.println("Digite o ID do funcionário:");
        double id = scan.nextDouble();
        funcionario1.setIdFuncionario((int) id);

        System.out.println("Digite o nome do funcionário:");
        String nome = scan.next();
        funcionario1.setNomeFuncionario(nome);



        funcionario1.RetornarDados();
        scan.close();
    }
}