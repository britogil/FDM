package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Financiamento {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor Total do imovel: ");
		double valortotalImovel = sc.nextDouble();
		System.out.println("Valor pago de entrada: ");
		double valorPagoEntrada = sc.nextDouble();
		System.out.println("Será financiado em quantos meses? ");
		int mesesFinanciado = sc.nextInt();
		
		double financiamento = valorPrestacaoFinanciamento(valortotalImovel, valorPagoEntrada, mesesFinanciado);
		showResult(financiamento);
			
		sc.close();
	}
	
	public static double valorPrestacaoFinanciamento(double vti, double vpe, int mf) {
		double resultado;
		       resultado = (vti - vpe) / mf;
		       return resultado;
	}
	
	public static void showResult(double financiamt) {
		System.out.printf("Valor do financiamento = %.2f", financiamt);
	}

}