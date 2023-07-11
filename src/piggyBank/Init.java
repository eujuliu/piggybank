package piggyBank;

import java.util.ArrayList;
import java.util.Scanner;

// Usei nomes em inglês por prefencia minha.

public class Init {
	public static void main(String[] args) {
		PiggyBank piggyBank = new PiggyBank();
		
		Scanner keyboard = new Scanner(System.in);
		
		Boolean executing = true;
		
		// Aqui eu coloquei um loop para sempre voltar para o menu, depois de fazer alguma operação.
		while(executing) {
			System.out.println("COFRINHO \n"
					+ "1 - Adicionar Moeda \n"
					+ "2 - Remover Moeda \n"
					+ "3 - Listar Moedas \n"
					+ "4 - Calcular total convertido para Real \n"
					+ "0 - Encerrar");
			
			int menuOption = keyboard.nextInt();
			
			// Um switch que recebe o input do usuario.
			switch (menuOption) {
				case 1:
					System.out.println("Escolha a Moeda: \n"
							+ "1 - Real \n"
							+ "2 - Dolar \n"
							+ "3 - Euro");
					// Pego o input do user para selecionar uma moeda
					int currencyType = keyboard.nextInt();
					
					System.out.println("Digite o valor:");
					
					// Pego o valor que o user quer adicionar dessa moeda.
					double value = keyboard.nextDouble();
					Currency currency = null;
					
					// Crio a moeda e adiciono o valor a ela.
					switch (currencyType) {
						case 1:
							currency = new Real(value);
							break;
						case 2:
							currency = new Dolar(value);
							break;
						case 3:
							currency = new Euro(value);
							break;
					}
						
					// A moeda é adicionada a lista.
					piggyBank.add(currency);
					break;
				case 2:
					// Pego todas as moedas
					ArrayList<Currency> currencies = piggyBank.values();
					
					// Retorno todas as moedas para o user, para que ele selecione qual vai ser deletada.
					for (int i = 0; i < currencies.size(); i++) {
						Currency current = currencies.get(i);
						
						System.out.printf("%d - %s \n", i + 1, current.info());
					}
					
					int removeIndex = keyboard.nextInt();
					Currency currencyToDelete = currencies.get(removeIndex - 1);
					
					piggyBank.remove(currencyToDelete);
					break;
				case 3:
					// Listo todas as moedas.
					piggyBank.listCurrencies();
					break;
				case 4:
					// Retorno o total convertido.
					piggyBank.totalConverted();
					break;
				default:
					// Aqui termino a execução do loop e fecho o keyboard.
					executing = false;
					keyboard.close();
					break;
					
			}
			
		}
	}
}
