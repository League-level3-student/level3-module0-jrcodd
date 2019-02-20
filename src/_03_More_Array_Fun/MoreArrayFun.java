package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	static String[] array = { "hi ", "the ", "sky ", "is ", "blue " };

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		// printer(array);
		// reversePrinter(array);
		// boringArrrayThing(array);
		randomPrinter(array);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printer(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void reversePrinter(String[] array) {
		for (int j = array.length - 1; j > -1; j--) {

			System.out.print(array[j]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void boringArrrayThing(String[] array) {
		for (int i = 0; i < array.length; i += 2) {
			System.out.print(array[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	static void randomPrinter(String[] array) {
		Random r = new Random();
		ArrayList<Integer> usedValues = new ArrayList<Integer>();
		int currentValue;
		while (array.length != usedValues.size()) {
			currentValue = r.nextInt(array.length);

			if (!usedValues.contains(currentValue)) {
				usedValues.add(currentValue);
				System.out.print(array[currentValue]);
			}
		}
	}
}
