package util;

public class Bill {
	public static char gender;
	public static double beer = 5.00;
	public static double barbecue = 7.00;
	public static double softDrink = 3.00 ;
	//public static double ticket;

	public static double feeding(int qtdb, int qtdbc, int qtdsd) {
		double cons = (qtdb * beer) + (qtdbc * barbecue) +(qtdsd * softDrink);
		return cons;
	}

	public static double ticket() {
		double value = 0;
		if (gender == 'm') {
			value = 10.00;
		}
		else if (gender == 'f') {
			value = 8.00;
		}

		return value;
	}

	public static double cover() {
		double value = 0;
		//double isento;
		//double naoIsento;
		if(value > 30.00) {
			value = 0.00;
		}
		
		else if(value < 30.00) {
			value = 4.00;
		}
		
		return value;
		
	}
	
	public static double total(int qtdb, int qtdbc, int qtdsd) {
		double vTotal = feeding(qtdb, qtdbc, qtdsd) + ticket();
		return vTotal;
		
	}

}
