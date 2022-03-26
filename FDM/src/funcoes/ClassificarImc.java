package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class ClassificarImc {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Digite a Altura: ");
		double altura = sc.nextDouble();
		
		String imc = classificacaoImc(peso, altura);
		showResult(imc);
		
		sc.close();
	}
	
	public static String classificacaoImc(double p, double a) {
		double imc;
		String classificacao = null;
		       imc = p / Math.pow(a, 2);
		       if(imc < 20) {
		    	   classificacao = "Abaixo do Peso";
		       }
		       else if(imc > 20 && imc <= 25) {
		    	   classificacao = "Peso Normal";
		       }
		       else if(imc > 25 && imc <= 30) {
		    	   classificacao = "Sobre Peso";
		       }
		       else if(imc > 30) {
		    	   classificacao = "Obeso";
		       }
		return classificacao;
	}
	
	public static void showResult(String imc) {
		System.out.print("Resultado do IMC: " + imc);
	}

}