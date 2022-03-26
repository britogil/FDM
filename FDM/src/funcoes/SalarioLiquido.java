package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor do Salario Bruto: ");
		double salarioBruto = sc.nextDouble();

		double calculaSalarioLiq = salarioLiquido(salarioBruto);
		showResult(calculaSalarioLiq);
		
//		double calcImposto = imposto(salarioBruto);
//		showResult(calcImposto);
		
		sc.close();
	}

	public static double imposto(double salBruto) {
		double impostoPago = 0;
		if(salBruto <= 4000) {
			impostoPago = salBruto * 0.20;
		}
		else if(salBruto > 4000) {
			impostoPago = salBruto * 0.25;
		}
		return impostoPago;
	}
//	public static void showResult(double calcImposto) {
//		System.out.printf("Imposto: %.2f", calcImposto);
//	}

	public static double previdencia(double salBruto) {
		double previdenciaPago = 0;
		if(salBruto <= 1500) {
			previdenciaPago = salBruto * 0.10;
		}
		else if(salBruto > 1500) {
			previdenciaPago = salBruto * 0.15;
		}
		return previdenciaPago;
	}

	public static double salarioLiquido(double salBruto) {
		double salarioLiquido = 0;
		salarioLiquido = salBruto - previdencia(salBruto) - imposto(salBruto);
		return salarioLiquido;
	}
	
	public static void showResult(double calculaSalarioLiq) {
		System.out.printf("Slario Liquido = %.2f", calculaSalarioLiq);
	}
	    

}
