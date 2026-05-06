package estoque;

public class Produto {
	
	
	String nome;
	double preco;
	int quantidade;
	
	
	public double calcularValorTotal() {
		return preco * quantidade;
	}
	
	public void exibirDados() {
		
		System.out.println("Nome: " + nome);
		System.out.println( "Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor Total: " + calcularValorTotal() );
	}
	
	public void entradaEstoque(int quantidadeAdicionada) {
		quantidade += quantidadeAdicionada;
	}
	
	public void saidaEstoque(int quantidadeRemovida) {
		quantidade -= quantidadeRemovida;
	}
	
}
