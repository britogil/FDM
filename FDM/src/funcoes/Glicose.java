package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da glicose: ");
		double valorGlicose = sc.nextDouble();
			
		String glicose = mostrarGlicose(valorGlicose);
		showResult(glicose);
		
		sc.close();
	}
	
	public static String mostrarGlicose(double vGlicose) {
		String glicose = null;
		if(vGlicose <= 100 ) {
			 glicose = "Normal";
		}
		else if(vGlicose > 100 && vGlicose < 140) {
			 glicose = "Elevado";
		}
		else if(vGlicose > 140) {
			 glicose = "Diabete";
		}
		return glicose;
	}
	
	public static void showResult(String rGlicose) {
		System.out.println("Classificação: " + rGlicose);
	}

}
