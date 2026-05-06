package aumentoSalarial;

public class Funcionario {
	
	String nome;
	double salario;
	
	  public double calcularAumento() {
	        if (salario >= 1 && salario <= 1000) {
	            return salario * 1.15;
	        } else if (salario >= 1001 && salario <= 1500) {
	            return salario * 1.10;
	        } else if (salario >= 1501 && salario <= 2000) {
	            return salario * 1.05;
	        } else {
	            return salario;
	        }
	   }
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("salario: " + salario);
		System.out.println(calcularAumento());
	}
	
	

}
