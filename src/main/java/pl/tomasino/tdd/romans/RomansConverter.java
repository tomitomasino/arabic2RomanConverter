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

		//		if (arabicNumb < 10 && ((arabicNumb + 1) % 5 == 0 || (arabicNumb + 1) % 10 == 0)) // for 4,9,14,19 etc
		//			result = "I";
		//
		//		if (arabicNumb + 1 >= 10 && (arabicNumb % 10 >= 0 || (arabicNumb + 1) % 10 == 0)) // for 10, 20,30 etc
		//			result += "X";
		//
		//		if (arabicNumb > 10 && ((arabicNumb + 1) % 5 == 0 || (arabicNumb + 1) % 10 == 0)) // for 4,9,14,19 etc
		//			result += "I";
		//
		//		if (arabicNumb > 3 && (arabicNumb + 1) % 10 != 0 && !(arabicNumb % 10 == 0) && ((arabicNumb + 1) % 5 == 0 || // for 4
		//				((arabicNumb % 5 >= 0 && arabicNumb % 5 <= 3) && arabicNumb % 10 >= 5))) // for 5-8
		//			result += "V";
		//
		//		if (arabicNumb % 5 == 1) // for 1,6,11,16etc
		//			result += "I";
		//
		//		if (arabicNumb % 5 == 2) // for 2,7,12,17 etc
		//			result += "II";
		//
		//		if (arabicNumb % 5 == 3) // for 3,8,13,18
		//			result += "III";

		return result;
	}

	public int getLargestDivider(int number) {

		for (int i = arabicImportant.length - 1; i >= 0; i--) {
			if (number / arabicImportant[i] >= 1 || ((number + getLowerTens(number)) / arabicImportant[i]) >= 1)
				return arabicImportant[i];
		}
		return 0;

	}

	public int getLowerTens(int number) {
		for (int i = arabicImportant.length - 1; i > 0; i--) {
			if (arabicImportant[i - 1] < number && Integer.toString(arabicImportant[i - 1]).startsWith("1")) {
				return arabicImportant[i - 1];
			}
		}
		return 0;
	}

}
