package pricetostring;

public class Words {
	private final String[][] from0till9 = {{"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
			{"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}};
	private final String[] from11till19 = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
			"пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
	private final String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
			"шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
	private final String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
			"шестьсот", "семьсот", "восемьсот", "девятьсот"};
	private final String[] thousands = {"тысяч", "тысяча", "тысячи", "тысячи", "тысячи",
			"тысяч", "тысяч", "тысяч", "тысяч", "тысяч"};

	public String[][] getFrom0till9() {
		return from0till9;
	}

	public String[] getFrom11till19() {
		return from11till19;
	}

	public String[] getTens() {
		return tens;
	}

	public String[] getHundreds() {
		return hundreds;
	}

	public String[] getThousands() {
		return thousands;
	}
}
