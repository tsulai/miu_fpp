package prog3_1_code;

import java.text.DateFormat;
import java.time.LocalDate;

public class Util {
	public static String dateAsString(LocalDate d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
	
}
