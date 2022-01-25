package pricetostring;

public class CurrencyRubls implements Currency{
	private final String[] rub = {"рублей", "рубль", "рубля", "рубля", "рубля",
			"рублей", "рублей", "рублей", "рублей", "рублей"};

	public String[] getCurrencyName(){
		return rub;
	}
}
