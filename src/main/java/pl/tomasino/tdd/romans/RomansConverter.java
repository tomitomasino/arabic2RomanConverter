package pl.tomasino.tdd.romans;

import java.util.HashMap;
import java.util.Map;

public class RomansConverter {

	String result = "";
	Map<Integer, String> arabic2romans = new HashMap<Integer, String>();
	int[] arabicImportant = { 1, 5, 10, 50, 100 };

	public RomansConverter() {
		arabic2romans.put(1, "I");
		arabic2romans.put(5, "V");
		arabic2romans.put(10, "X");
		arabic2romans.put(50, "L");
		arabic2romans.put(100, "C");
	}

	public String convert(int input) {

		while (input > 0) {
			int lagestDivider = getLargestDivider(input);
			input = input - lagestDivider;

			if (input < 0) {
				result += arabic2romans.get(getLargestDivider(-input));
				input = lagestDivider;
			} else {
				result += arabic2romans.get(lagestDivider);
			}
		}
		return result;
	}

	private int getLargestDivider(int number) {

		for (int i = arabicImportant.length - 1; i >= 0; i--) {
			if (number / arabicImportant[i] >= 1 || ((number + getLowerTens(number)) / arabicImportant[i]) >= 1)
				return arabicImportant[i];
		}
		return 0;
	}

	private int getLowerTens(int number) {
		for (int i = arabicImportant.length - 1; i > 0; i--) {
			if (arabicImportant[i - 1] < number && Integer.toString(arabicImportant[i - 1]).startsWith("1"))
				return arabicImportant[i - 1];
		}
		return 0;
	}
}
