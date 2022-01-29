package pricetostring;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class PriceToWordsTest {

	@Test
	void main() {
		System.setIn(new ByteArrayInputStream("hello".getBytes()));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	PriceToWords.main(null);
	assertTrue(out.toString().contains("Неправильный ввод. Необходимо число"));
	}

}