package exercicio0603;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// Variáveis 
		double base, altura, area;
		
		// Instaciar classe scanner 
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("Qual a base do triângulo? ");
		base = ler.nextDouble();
		
		System.out.println("Qual a altura do triângulo? ");
		altura = ler.nextDouble();
		
		// Processamneto 
		area = base*altura/2;
		
		// Saída
		System.out.println("A área do triângulo é:" + area);
	}
}
