package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Contribuintes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Comtribuintes Você vai digitar: ");
		int qtdContribuintes = sc.nextInt();

		double rendaACS [] = new double[qtdContribuintes];
		double rendaACPS [] = new double[qtdContribuintes];
		double rendaACGC [] = new double[qtdContribuintes];
		double gastosM [] = new double[qtdContribuintes];
		double gastosE [] = new double[qtdContribuintes];

//		double salario = 0;
//		double impss = 0;
//		double impssv = 0;
//		double impsgc = 0;
//		//double impBT = 0;
//		double rendaPrestDeservicos = 0;
//		double ganhoCapital = 0;
		double abatimento = 0;
		double impostoDevido = 0;

		int count = 0;
		for(int i = 0; i < qtdContribuintes; i++) {
			count++;
			System.out.println();
			System.out.println("Digite os dados do " + count + "º Contribuinte: ");
			System.out.println();
			System.out.print("Renda Anual Com Salario: ");
			rendaACS[i] = sc.nextDouble();
			System.out.print("Renda Anual Com Prestação de Serviço: ");
			rendaACPS[i] = sc.nextDouble();
			System.out.print("Renda Anual com Ganho de Capital: ");
			rendaACGC[i] = sc.nextDouble();
			System.out.print("Gastos Medicos: ");
			gastosM[i] = sc.nextDouble();
			System.out.print("Gastos Educacionais: ");
			gastosE[i] = sc.nextDouble();			
		}
		count = 0;
		for(int i = 0; i < qtdContribuintes; i++) {
			count++;
			System.out.println();
			System.out.println("Resumo do "+ count +"º Contribuinte: ");
			double impBT = impostoBrutoTotal(rendaACS[i], rendaACPS[i], rendaACGC[i]);
			showResult(impBT);
			
			double abat = abatimento(rendaACS[i], rendaACPS[i], rendaACGC[i], gastosM[i], gastosE[i] );
			showResult2(abat);
			
			double imptoDev = impostoDevido(impostoDevido, abatimento);
			showResult3(imptoDev);
		}


		sc.close();
	}

	public static double impostoSobreSalario(double salario){
		double impss = 0;
		double rendaAnualSalario = 0;
		salario = rendaAnualSalario / 12;
		if (salario >= 3000 && salario < 5000){
			impss = ((salario * 0.1) * 12);
		}
		else if(salario > 5000) {
			impss = ((salario * 0.2) * 12);
		}
		return impss;
	}

	public static double impostoSobreServicos(double rendaPrestDeservicos) {
		double impssv = 0;
		double rendaACPS = 0;
		rendaPrestDeservicos = rendaACPS / 12;
		if(rendaPrestDeservicos > 0){
			impssv = ((rendaPrestDeservicos * 0.2) * 12);
		}
		return impssv;
	}

	public static double impostoSobreGC(double ganhoCapital) {
		double impsgc = 0;
		double rendaACGC = 0;
		ganhoCapital = rendaACGC / 12;
		if(ganhoCapital > 0) {
			impsgc = ((ganhoCapital * 0.2) * 12);
		}
		return impsgc;
	}

	public static double impostoBrutoTotal(double salario, double rendaPrestDeservicos, double ganhoCapital ) {
		double impBT = 0;
		return impBT = salario + rendaPrestDeservicos + ganhoCapital;
	}

	public static void showResult( double impBT) {
		System.out.printf("Imposto Bruto Total: %.2f\n", impBT);
	}
	
//	public static double gdedutivel(double gastosM, double gastosE) {
//		double gdedut = 0;
//		double gastoDedutivel = gastosM + gastosE;
//		return gdedut;
//	}
//	
//	public static double mdedutivel(double impostoBrutoTotal) {
//		double maximoDedutivel = 0;
//		return maximoDedutivel = impostoBrutoTotal * 0.3;
//	}
	
	public static double abatimento(double salario, double rendaPrestDeservicos, double ganhoCapital, double gastosM, double gastosE  ) {
		double abati = 0;
		double gdedutivel = 0;
		double mdedutivel = 0;
		if(gdedutivel > mdedutivel ) {
			 abati = mdedutivel;
		}
		else {
			abati = gdedutivel;
		}
		return abati;
	}
	public static void showResult2(double abat) {
		System.out.printf("Abatimento: %.2f\n", abat);
	}
	
	public static double impostoDevido(double impostoBrutoTotal, double abatimento) {
		double impDevido = 0;
		impDevido = impostoBrutoTotal - abatimento;
		return impDevido;
	}
	
	public static void showResult3(double imptoDev) {
		System.out.printf("Imposto Devido: %.2f\n", imptoDev );
	}
}
