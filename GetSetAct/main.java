package GetSetAct;

public class main {
    public static void main(String[] args){

        pessoaDados pessoa1 = new pessoaDados("João",  25, "Brasil");

        //Primeiro retorno
        pessoa1.exibirDados();
        
        System.out.println("\n-------------");    
        //Alterando os dados usando os métodos set
 
        pessoa1.setNome("Pedro");
        pessoa1.setIdade(30);
        pessoa1.setPais("Argentina");

        
        pessoa1.exibirDados();


    }
}
