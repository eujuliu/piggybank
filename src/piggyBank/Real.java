package piggyBank;

public class Real extends Currency {
	Real(double value) {
		this.value = value;
	}
	
	@Override
	double convert() {
		return this.value;
	}
}
