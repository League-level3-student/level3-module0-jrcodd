package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int smallestnum = 1000;
	public static void main(String[] args) {
		
		// 1. make an array of 5 Strings
		String[] stringArray = new String[5];
		// 2. print the third element in the array
		System.out.println(stringArray[3]);
		// 3. set the third element to a different value
		stringArray[3] = "a different value";
		// 4. print the third element again
		System.out.println(stringArray[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "striiiings";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		// 7. make an array of 50 integers
		int[] intArray = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		
		int largestnum = -100;
		Random r = new Random(500);
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = r.nextInt(500);
			if (intArray[i] > largestnum) {
				largestnum = intArray[i];
			}
			if (intArray[i] < smallestnum) {
				smallestnum = intArray[i];
			}

		}

		// 9. without printing the entire array, print only the smallest number on the
		// array
		
		System.out.println("The smallest number is " + smallestnum);
		// 10 print the entire array to see if step 8 was correct
		for (int j = 0; j < intArray.length; j++) {

			System.out.println(intArray[j]);
		}
		// 11. print the largest number in the array.
		System.out.println("The largest number is " + largestnum);
		// 12. print only the last element in the array
		System.out.println("the last one is " + intArray[intArray.length - 1]);
	}
	int smallestnum() {
		return smallestnum;
	}
}
