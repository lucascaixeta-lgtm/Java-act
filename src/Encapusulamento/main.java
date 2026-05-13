package Encapusulamento;

public class main {
    public static void main(String[] args){


        //criar objeto
        contaBancaria conta1 = new contaBancaria("Fulano", 1276);


        // modificador privado
        //conta1.saldo = 1000; é um atributo privido
        System.out.println("\n/----------------------------/");
        conta1.depositar(500);
        //conta1.exibirDados();

        System.out.println("\n/----------------------------/");
        conta1.sacar(200);
        conta1.exibirDados();


        System.out.println("\n/----------------------------/");
        System.out.println("Saldo atual:" + conta1.getSaldo());

        //trocar o nome do titular
        //conta1.titular = "Ciclano"; // erro, pois o atributo é privado
        System.out.println("\n/----------------------------/");
        conta1.setTitular(""); // forma correta de alterar o titular usando o metodo set
        conta1.getTitular();


        System.out.println("\n/----------------------------/");
        conta1.sacar(100); // teste de saldo insuficiente

    }
    
}
