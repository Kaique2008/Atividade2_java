package exercicio0603;
import java.util.Scanner;

public class exercico3 {
	
	public static void main(String[] args) {
		// Variáveis
		double a, b, som, divisão, multiplicação, subtração;
		
		// Instaciar classe 
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("Qual o primeiro valor? ");
		a = ler.nextDouble();
		
		System.out.println("Qual o segundo valor? ");
		b = ler.nextDouble();
		
		//Processamento 
		som = a+b;
		subtração = a-b;
		divisão = a/b;
		multiplicação = a*b;
		
		// Saída 
		System.out.println("Os resultados são: " + som);
		System.out.println("Os resultados são: " + subtração);
		System.out.println("Os resultados são: " + divisão);
		System.out.println("Os resultados são: " + multiplicação);
		
		
	}

}
