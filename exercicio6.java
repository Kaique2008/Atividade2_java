package exercicio0603;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		// Variávei 
		double reais, dolar, euro;
		
		//Instanciar classe escanner 
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Qual valor deseja conberter? ");
		reais = ler.nextDouble();
		
		// Processamento
		dolar = reais*4.98;
		euro = reais*5.38;
		
		// Saída
		System.out.println("O valor em dolar é:" + dolar);
		System.out.println("O valor em euro é: " + euro);
		
		
		
		
		
	}

}
