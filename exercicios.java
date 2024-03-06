package exercicio0603;
import java.util.Scanner;

public class exercicios {
	
	public static void main(String[] args) {
		// Variáveis 
		double fahrenheit, celsius, som;
		
		// Instaciar classe Scanner 
		Scanner ler = new Scanner(System.in);
		
		// Entrada dados 
		System.out.println("Qual valor de fahrenheit? ");
		fahrenheit = ler.nextDouble();
		
		// Processamento 
		celsius = ((fahrenheit-32)*5)/9;
		
		//Saída 
		System.out.println("O valor de fahrenheit em celsius é: " + celsius);
		
		
	}
	
}


