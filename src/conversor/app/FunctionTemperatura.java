package conversor.app;

public class FunctionTemperatura {

	double resultado = 0;
	double fahrenheit = 0;
	double kelvin = 0;
	double rakine = 0;
	double celsius = 0;

	public void convertirTemperatura(double cantidad, String tempSeleccionada) {
		String seleccionTemperaturas[] = { "Grados Celsius a Fahrenheit", "Grados Celsius a Kelvin",
				"Grados Fahrenheit a Celsius", "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit",
				"Grados Celsius a Rakine", "Grados Fahrenheit a Kelvin", "Grados Fahrenheit a Rankine" };

		// Conversión de Fahrenheit a Kelvin

		// Conversión de Fahrenheit a Rankine

		if (tempSeleccionada == seleccionTemperaturas[0]) {
			// Celsius a Fara
			resultado = cantidad * 9 / 5 + 32;
		} else if (tempSeleccionada == seleccionTemperaturas[1]) {
			// celsius a Kelvin
			resultado = cantidad + 273.15;
		} else if (tempSeleccionada == seleccionTemperaturas[2]) {
			// Conversión de Fahrenheit a Celsius
			resultado = (cantidad - 32) * 5 / 9;
		} else if (tempSeleccionada == seleccionTemperaturas[3]) {
			// Kelvin a Grados Celsius
			resultado = cantidad - 273.15;
		} else if (tempSeleccionada == seleccionTemperaturas[4]) {
			resultado = (cantidad - 273.15) * 9 / 5 + 32;
		} else if (tempSeleccionada == seleccionTemperaturas[5]) {
			// Conversión de Celsius a Rankine
			resultado = cantidad * 9 / 5 + 491.67;
		} else if (tempSeleccionada == seleccionTemperaturas[6]) {
			// Grados Fahrenheit a Kelvin
			resultado = (cantidad - 32) * 5 / 9 + 273.15;
		} else if (tempSeleccionada == seleccionTemperaturas[7]) {
			// Grados Fahrenheit a Rankine
			resultado = cantidad + 459.67;
		}
	}
}
