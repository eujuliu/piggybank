package piggyBank;

public class Dolar extends Currency {
	Dolar(double value) {
		this.value = value;
	}
	
	@Override
	double convert() {
		double dolar = 4.87;
		
		return this.value * dolar;
	}
}
