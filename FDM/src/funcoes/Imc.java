package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o Peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a Altura: ");
		double altura = sc.nextDouble();
		
		double resutlImc = indiceMassaCorp(peso, altura);
		showResult(resutlImc);
				
		sc.close();
	}
	
	public static double indiceMassaCorp(double p, double a) {
		double imc;
		       imc = p / Math.pow(a, 2);
		return imc;
	}
	
	public static void showResult(double resultadoImc) {
		System.out.printf("Seu IMC é: %.2f", resultadoImc);
	}
	

}
