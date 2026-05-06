package resolverSala;

public class Aluno {
	
	String nome;
	double NotaPrimeiro;
	double NotaSegundo;
	double NotaTerceiro;
	
	double NotaFinal() {
		return NotaPrimeiro + NotaSegundo + NotaTerceiro;
	}
	
	public void ValidarAprovacao() {
		double nota = NotaFinal();
		
		if(nota >= 70) {
			System.out.println("Aprovado");
		}
		else{
			System.out.println("reprovado");
			System.out.println("Faltou: " + (70 - nota) +" pontos");
		}
	}
	
	
	public void exibirDados() {
		System.out.println("O nome do aluno: " + nome);
		System.out.println("A nota do primero semestre: " + NotaPrimeiro);
		System.out.println("A nota do segundo semestre: " + NotaSegundo);
		System.out.println("A nota do terceiro semestre: " + NotaTerceiro);
		System.out.println("Nota final: " + NotaFinal());
		
		
	}

}
