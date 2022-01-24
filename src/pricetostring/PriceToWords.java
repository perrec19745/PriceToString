package pricetostring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceToWords {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введите сумму: ");
			long sum = scanner.nextLong();
			if (sum <= 0 || sum >= 1000000){
	throw new RuntimeException("Число должно быть в пределах от 1 до 999999");
			}
			Currency currency = new Currency();
			Price price = new Price(sum, "rub");
			price.setCurrency(currency);
			price.setCurrencyName("usd");
			String result = price.changePriceToWords();
			System.out.println(result);
		}
		catch (InputMismatchException e){
			System.out.println("Неправильный ввод. Необходимо число");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
