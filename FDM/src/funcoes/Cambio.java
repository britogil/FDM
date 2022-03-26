package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do Dolar: ");
		double cotacaoDolar = sc.nextDouble();
		System.out.print("Digite a quantia em Reais: ");
		double quantiaEmReais = sc.nextDouble();
		
		double compraEmDolar = realParaDolar(cotacaoDolar, quantiaEmReais);
		showResult(compraEmDolar);
		
		sc.close();
	}
	
	public static double realParaDolar(double cd, double qr) {
		double cotacao;
		cotacao = qr / cd;
		return cotacao;
	}
	
	public static void showResult(double compraDolar) {
		System.out.printf("Você pode comprar $ %.2f dolares com essa quantia.", compraDolar);
	}

}