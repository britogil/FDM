package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Contribuintes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos Comtribuintes Você vai digitar: ");
		int qtdContribuintes = sc.nextInt();
		
		
		
		
		sc.close();
	}
	
	public static double impostoSobreSalario(double salario, double rendaAnualSalario){
		double impss = 0; 
		salario = rendaAnualSalario / 12;
		if (salario >= 3000 && salario < 5000){
			impss = ((salario * 0.1) * 12);
		}
		else if(salario > 5000) {
			impss = ((salario * 0.2) * 12);
		}			
		return impss;
	}
	
	public static double impostoSobreServicos(double rendaPrestDeservicos, double rendaAnualPS){
		double impssv = 0;
		rendaPrestDeservicos = rendaAnualPS / 12;
		if(rendaPrestDeservicos > 0){
			impssv = ((rendaPrestDeservicos * 0.2) * 12);
		}
		return impssv;
	}
	
	public static double impostoSobreGC(double ganhoCapital, double rendaAnualGC){
		double impsgc = 0;
		ganhoCapital = rendaAnualGC / 12;
		if(ganhoCapital > 0) {
			impsgc = ((ganhoCapital * 0.2) * 12);
		}
		return impsgc;
		
	}
	
	public static double impostoBrutoTotal(double impostoSobreSalario, double impostoSobreServicos, double impostoSobreGC){
		double impBT = 0;
		impBT = impostoSobreSalario + impostoSobreServicos + impostoSobreGC;
		return impBT;
	}
	
	public static double abatimento(){
		double valorAbaterImposto = 0;
	}
	

}
