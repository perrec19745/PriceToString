package pricetostring;

import java.util.ArrayList;
import java.util.List;

public class Price extends Words {
	private long price;
	private String currencyName;
	Currency currency;

	public Price(long price, String currencyName) {
		this.price = price;
		this.currencyName = currencyName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String changePriceToWords() {
		String result = "";
		String text = "";
		String[] currencys = this.getCurrency().chooseCurrencyName(currencyName);
		List<Integer> segments = new ArrayList<>();
		while (price > 0) {
			int segment = (int) price % 1000;
			segments.add(segment);
			price = price / 1000;
		}

		for (int i = segments.size() - 1; i >= 0; i--) {
			int low = segments.get(i) % 10;
			int average = segments.get(i) % 100 / 10;
			int hi = segments.get(i) / 100;
			if (average == 0) {
				text = getHundreds()[hi] + " " + getFrom0till9()[i][low] + " ";
			}
			else if (average == 1) {
				text = getHundreds()[hi] + " " + getFrom11till19()[low] + " ";
			}
			else {
				text = getHundreds()[hi] + " " + getTens()[average] + " " + getFrom0till9()[i][low] + " ";
			}

			if (i > 0) {
				text = text + " " + getThousands()[low] + " ";
			} else {
				text = text + " " + currencys[low];
			}
//			results.add(text);
	result += text;
		}
//		for (String s: results) {
//			result += s;
//		}
	return result;
	}

}