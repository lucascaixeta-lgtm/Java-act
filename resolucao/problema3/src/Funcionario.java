public class Funcionario {

    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario = 1621.00;

    public Funcionario(int idFuncionario, String nomeFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
    }

    public Funcionario(){}


    //getter 

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getSalarioFuncionario() {
        return String.format("R$ %.2f", salarioFuncionario);
    }

    //setters

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        if(nomeFuncionario != null && nomeFuncionario.length() > 3) {
            this.nomeFuncionario = nomeFuncionario;
        } else {
            System.out.println("O nome deve conter mais de 3 caracteres.");
        }
    }

    public void RetornarDados(){
        System.out.println("ID do Funcionario: " + getIdFuncionario());
        System.out.println("Nome do Funcionario: " + getNomeFuncionario());
        System.out.println("Salário do Funcionario: " + getSalarioFuncionario());
    }


}
