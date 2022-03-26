package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double temperaturaF = sc.nextDouble();
		
		double celsius = convert(temperaturaF);
		showResult(celsius);
		
		sc.close();

	}

	private static double convert(double tempEmFahrenheit) {
		double tempCelsius;
		       tempCelsius = ( (tempEmFahrenheit - 32)/ 1.8);	
		return tempCelsius;
	}
	
	private static void showResult(double temperaturaF) {
		System.out.printf("Temperatura em Celsius = %.2f", temperaturaF);
	}

}
