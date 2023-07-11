package piggyBank;

public abstract class Currency {
	double value;
	
	String info() {
		String className = this.getClass().getName().substring(10);
		
		return String.format("%s - %.2f", className, this.value);
	}
	
	abstract double convert();
}
