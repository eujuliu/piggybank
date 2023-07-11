package piggyBank;

public class Euro extends Currency {
	Euro(double value) {
		this.value = value;
	}
	
	@Override
	double convert() {
		double euro = 5.35;
		
		return this.value * euro;
	}
}
