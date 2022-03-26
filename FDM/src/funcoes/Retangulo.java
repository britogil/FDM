package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do retangulo: ");
		double baseRetangulo = sc.nextDouble();
		System.out.print("Digite o valor da altuda do retangulo: ");
		double alturaRetangulo = sc.nextDouble();
		
		double diagonal = calculaDiagonal(baseRetangulo, alturaRetangulo);
		showResult(diagonal);
		
		double area = calculaArea(baseRetangulo, alturaRetangulo);
		showResult1(area);
		
		double perimetro = calculaPerimetro(baseRetangulo, alturaRetangulo);
		showResult2(perimetro);
		
		sc.close();
	}
	
	public static double calculaDiagonal(double bR, double aR) {
		double resultDiagonal;
		double diagonal = (aR * aR) + (bR * bR) ;
		resultDiagonal = Math.sqrt(diagonal) ;
		return resultDiagonal;
	}
	
	public static void showResult(double rDiagonal) {
		System.out.printf("Diagonal = %.2f\n", rDiagonal);
	}
	
	public static double calculaArea(double bR, double aR) {
		double resultArea;
		       resultArea = bR * aR;
		return resultArea;
	}
	
	public static void showResult1(double rArea) {
		System.out.printf("Area = %.2f\n", rArea);
	}
	
	public static double calculaPerimetro(double bR, double aR ) {
		double resulPerimetro;
		       resulPerimetro = 2 * (bR + aR);
		       return resulPerimetro;
	}
	
	public static void showResult2(double rPerimetro) {
		System.out.printf("Perimetro = %.2f", rPerimetro);
	}

}
