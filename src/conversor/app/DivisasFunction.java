package conversor.app;

import javax.swing.JLabel;

public class DivisasFunction {

	double resultado = 0;

	public static void main(String[] args) {
		DivisasFunction div = new DivisasFunction();
		div.divisas(5, "Euros", "Pesos Mexicanos");
	}

	public double divisas(double cantidad, String primerDivisas, String segundaDivisa) {
		String[] divisas = { "Pesos Mexicanos", "Dolar", "Yen Japones", "Euros", "Won sul-coreano" };
		double[] valor = { 0.053, 18.96, 6.96, 0.049, 69.15 };
		double[] dolarPesos = { 18.36, 18.62, 131.61, 0.93, 1299.15 };
		double[] yenMonedas = { 0.14, 0.0076, 131.61, 0.0070, 9.87};
		double[] euroMonedas = { 19.81, 1.08, 142.09, 0.0070, 1402.08};
		double[] wonMonedas = { 0.014, 0.00077, 0.10, 0.00071, 1402.08};
		
		//Pesos a Dolares
		if (primerDivisas == divisas[0] && segundaDivisa == divisas[0]) {
			resultado = cantidad;
		} else if (primerDivisas == divisas[0] && segundaDivisa == divisas[1]) {
			resultado = cantidad * valor[1];
		} else if (primerDivisas == divisas[0] && segundaDivisa == divisas[2]) {
			resultado = cantidad * valor[2];
		} else if (primerDivisas == divisas[0] && segundaDivisa == divisas[3]) {
			resultado = cantidad * valor[3];
		} else if (primerDivisas == divisas[0] && segundaDivisa == divisas[4]) {
			resultado = cantidad * valor[4];
		}
		//Dolare a Pesos
		if (primerDivisas == divisas[1] && segundaDivisa == divisas[0]) {
			resultado = cantidad * dolarPesos[0];
		} else if (primerDivisas == divisas[1] && segundaDivisa == divisas[1]) {
			resultado = cantidad;
		} else if (primerDivisas == divisas[1] && segundaDivisa == divisas[2]) {
			resultado = cantidad * dolarPesos[2];
		} else if (primerDivisas == divisas[1] && segundaDivisa == divisas[3]) {
			resultado = cantidad * dolarPesos[3];
		} else if (primerDivisas == divisas[1] && segundaDivisa == divisas[4]) {
			resultado = cantidad * dolarPesos[4];
		}
		
		//Yen a monedas
		
		if (primerDivisas == divisas[2] && segundaDivisa == divisas[0]) {
			resultado = cantidad * yenMonedas[0];
		} else if (primerDivisas == divisas[2] && segundaDivisa == divisas[1]) {
			resultado = cantidad * yenMonedas[1];
		} else if (primerDivisas == divisas[2] && segundaDivisa == divisas[2]) {
			resultado = cantidad;
		} else if (primerDivisas == divisas[2] && segundaDivisa == divisas[3]) {
			resultado = cantidad * yenMonedas[3];
		} else if (primerDivisas == divisas[2] && segundaDivisa == divisas[4]) {
			resultado = cantidad * yenMonedas[4];
		}
		// Euro a Modenas
		
		if (primerDivisas == divisas[3] && segundaDivisa == divisas[0]) {
			resultado = cantidad * euroMonedas[0];
		} else if (primerDivisas == divisas[3] && segundaDivisa == divisas[1]) {
			resultado = cantidad * euroMonedas[1];
		} else if (primerDivisas == divisas[3] && segundaDivisa == divisas[2]) {
			resultado = cantidad * euroMonedas[0];
		} else if (primerDivisas == divisas[3] && segundaDivisa == divisas[3]) {
			resultado = cantidad;
		} else if (primerDivisas == divisas[3] && segundaDivisa == divisas[4]) {
			resultado = cantidad * euroMonedas[4];
		}
		// Won a modenas
		
		if (primerDivisas == divisas[4] && segundaDivisa == divisas[0]) {
			resultado = cantidad * wonMonedas[0];
		} else if (primerDivisas == divisas[4] && segundaDivisa == divisas[1]) {
			resultado = cantidad * wonMonedas[1];
		} else if (primerDivisas == divisas[4] && segundaDivisa == divisas[2]) {
			resultado = cantidad * wonMonedas[0];
		} else if (primerDivisas == divisas[4] && segundaDivisa == divisas[3]) {
			resultado = cantidad * wonMonedas[3];
		} else if (primerDivisas == divisas[4] && segundaDivisa == divisas[4]) {
			resultado = cantidad;
		}
		return resultado;
	}
}
