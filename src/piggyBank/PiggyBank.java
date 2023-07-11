package piggyBank;

import java.util.ArrayList;

public class PiggyBank {
	private ArrayList<Currency> currencies = new ArrayList<Currency>();
	
	public void add(Currency currency) {
		this.currencies.add(currency);
	}
	
	public void remove(Currency currency) {
		this.currencies.remove(currency);
	}
	
	public void listCurrencies() {
		for (Currency currency: this.currencies) {
			System.out.println(currency.info());
		}
	}
	
	public ArrayList<Currency> values() {
		return this.currencies;
	}
	
	public void totalConverted() {
		double total = 0;
		
		for (Currency currency: this.currencies) {
			total += currency.convert();
		}
		
		System.out.printf("Total convertido para Real: %.2f \n", total);
	}
}
