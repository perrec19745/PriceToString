package pricetostring;

public class Currency {
	private final String[] rub = {"рублей", "рубль", "рубля", "рубля", "рубля",
			"рублей", "рублей", "рублей", "рублей", "рублей"};
	private final String[] usd = {"долларов", "доллар", "доллара", "доллара", "доллара",
			"долларов", "долларов", "долларов", "долларов", "долларов"};

	public String[] getRub() {
		return rub;
	}

	public String[] getUsd() {
		return usd;
	}

	public String[] chooseCurrencyName(String s) {
		if (s.equalsIgnoreCase("usd")) {
			return usd;
		}
		return rub;
	}
}
