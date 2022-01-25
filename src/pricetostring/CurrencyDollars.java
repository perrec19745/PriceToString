package pricetostring;

public class CurrencyDollars implements Currency{
	private final String[] usd = {"долларов", "доллар", "доллара", "доллара", "доллара",
			"долларов", "долларов", "долларов", "долларов", "долларов"};

	public String[] getCurrencyName(){
		return usd;
	}

}
