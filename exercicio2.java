package exercicio0603;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		// Variáveis 
		double valorlitrogaso, dispercokm, consmedikm, quantlitrogas, custototal, som;
		
		// Instaciar classe scanner 
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("Qual o valor do litro da gasolina? ");
		valorlitrogaso = ler.nextDouble();
		
		System.out.println("Qual a distância percorrida em km? ");
		dispercokm = ler.nextDouble();
		
		System.out.println("Qual o consumo médio do carro? ");
		consmedikm = ler.nextDouble();
		
		// Processamento
		quantlitrogas = dispercokm/consmedikm;
		custototal = valorlitrogaso*dispercokm;
		
		// Saída 
		System.out.println("A quantidade de litro gsatos é: " + quantlitrogas);
		System.out.println("O custo total é: " + custototal);
		
		
		
	
		
	}

}
