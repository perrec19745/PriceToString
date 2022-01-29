package pricetostring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.security.auth.PrivateCredentialPermission;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {
	@DisplayName("проверяем двенадцать рублей")
	@org.junit.jupiter.api.Test
	void getPriceToWordsTestFor12Rubles() {
		Currency currency = new CurrencyRubls();
		Price price = new Price(12, currency);
		assertEquals("двенадцать рублей", price.getPriceToWords());
	}

	@org.junit.jupiter.api.Test
	void getPriceToWordsTestFor1Ruble() {
		Currency currency = new CurrencyRubls();
		Price price = new Price(1, currency);
		assertEquals("один рубль", price.getPriceToWords());
	}

	@org.junit.jupiter.api.Test
	void getPriceToWordsTestFor999999Rubles() {
		Currency currency = new CurrencyRubls();
		Price price = new Price(999999, currency);
		assertEquals("девятьсот девяносто девять тысяч девятьсот девяносто девять рублей", price.getPriceToWords());
	}

	@org.junit.jupiter.api.Test
	void getPriceToWordsTestFor123456Rubles() {
		Currency currency = new CurrencyRubls();
		Price price = new Price(123456, currency);
		assertEquals("сто двадцать три тысячи четыреста пятьдесят шесть рублей", price.getPriceToWords());
	}

	@org.junit.jupiter.api.Test
	void getPriceToWordsTestFor10001Dollars() {
		Currency currency = new CurrencyDollars();
		Price price = new Price(10001, currency);
		assertEquals("десять тысяч один доллар", price.getPriceToWords());
	}

	@Test
	public void testForZeroRubls() {
		Currency currency = new CurrencyRubls();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Price price = new Price(0, currency);
		});
		assertEquals("price must be > 0 and < 1000000", exception.getMessage());

	}

	@Test
	public void testForMillionRubls() {
		Currency currency = new CurrencyRubls();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Price price = new Price(1000000, currency);
		});
		assertEquals("price must be > 0 and < 1000000", exception.getMessage());
	}

	@Test
	public void testForMinusOneRubls() {
		Currency currency = new CurrencyRubls();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Price price = new Price(-1, currency);
		});
		assertEquals("price must be > 0 and < 1000000", exception.getMessage());
	}

	@Test
	public void testForCurrencyNull() {
		Currency currency = null;
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Price price = new Price(12, currency);
		});
		assertEquals("currency must not be null", exception.getMessage());
	}

}