package pricetostring;

import java.util.ArrayList;
import java.util.List;

public class Price {
	private long price;
	Currency currency;

	public Price(long price, Currency currency) {
	if (price <= 0 || price > 999999){
		throw new IllegalArgumentException("price must be > 0 and < 1000000");
	}
		if (currency == null){
			throw new IllegalArgumentException("currency must not be null");
		}
		this.price = price;
		this.currency = currency;
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

	public String getPriceToWords() {
		String result = "";
		String text = "";
		String[] currencys = this.currency.getCurrencyName();
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
				text = Words.getHundreds()[hi] + " " + Words.getFrom0till9()[i][low];
			}
			else if (average == 1) {
				text = Words.getHundreds()[hi] + " " + Words.getFrom10till19()[low];
			}
			else {
				text = Words.getHundreds()[hi] + " " + Words.getTens()[average] + " " + Words.getFrom0till9()[i][low];
			}

			if (i > 0) {
				if (average == 1){
					text = text + " " + Words.getThousands()[0] + " ";
				}
				else {
					text = text + " " + Words.getThousands()[low] + " ";
				}
			}
			else if (i == 0 && average == 1){
				text = text + " " + currencys[0];
			}
			else {
				text = text + " " + currencys[low];
			}
	result += text;
		}
	return result.trim().replace("  ", " ");
	}

}