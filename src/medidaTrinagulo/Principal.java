package medidaTrinagulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		LadosTriangulo primeiro = new LadosTriangulo();
		LadosTriangulo segundo = new LadosTriangulo();
		
		System.out.println("Dê as medidas dos lados do primeiro triangulo: ");
		primeiro.ladoA = scanner.nextDouble();
		primeiro.ladoB = scanner.nextDouble();
		primeiro.ladoC = scanner.nextDouble();
		
		System.out.println("Dê as medidas dos lados do segundo triangulo: ");
		segundo.ladoA = scanner.nextDouble();
		segundo.ladoB = scanner.nextDouble();
		segundo.ladoC = scanner.nextDouble();
	
		double areaPrimeiro = primeiro.calcularArea();
		double areaSegundo = segundo.calcularArea();
		
		System.out.println("Área do primeiro triângulo: " + areaPrimeiro);
		System.out.println("Área do segundo triângulo: " + areaSegundo);
		
		if(areaPrimeiro > areaSegundo) {
			System.out.println("O primeiro triangulo é o que tem maior área");
		} else if(areaSegundo > areaPrimeiro) {
			System.out.println("O segundo triangulo é o que tem maior área");
		}else {
			System.out.println("Ambos tem área do mesmo tamanho");
		}
		
		scanner.close();
	}

}
