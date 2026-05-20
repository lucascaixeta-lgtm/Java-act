/*
4 - Escreva um programa em Java para criar uma classe chamada Circulo com uma 
variável de instância privada raio. Forneça métodos públicos getter e setter para 
acessar e modificar a variável raio. Além disso, implemente dois métodos 
chamados calcularArea() e calcularPerimetro(), que retornem a área e o perímetro 
calculados com base no valor atual do raio. 
*/

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        circulo.setRaio(raio);
        
        circulo.mostrarDados();
        scan.close();
    } 
}