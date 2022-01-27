package pricetostring;

public class Words {
	private static final String[][] from0till9 = {{"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
			{"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}};
	private static final String[] from10till19 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
			"пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
	private static final String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
			"шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
	private static final String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
			"шестьсот", "семьсот", "восемьсот", "девятьсот"};
	private static final String[] thousands = {"тысяч", "тысяча", "тысячи", "тысячи", "тысячи",
			"тысяч", "тысяч", "тысяч", "тысяч", "тысяч"};

	public static String[] getHundreds(){
		return hundreds;
	}

	public static String[] getThousands() {
			return thousands;
	}

	public static String[] getFrom10till19() {
		return  from10till19;
	}

	public static String[] getTens() {
		return  tens;
	}

	public static String[][] getFrom0till9(){
		return from0till9;
	}
}
