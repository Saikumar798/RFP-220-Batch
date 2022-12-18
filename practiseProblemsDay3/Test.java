package practiseProblemsDay3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog as far as ";

		// Convert the string to lowercase so that we can count the letter 'a'
		// regardless of its case
		str = str.toLowerCase();

		// Initialize the counter variable
		int count = 0;

		// Iterate through the string and count the number of occurrences of the letter
		// 'a'
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				count++;
			}
		}

		// Print the result
		System.out.println("The letter 'b' occurs " + count + " times in the string");
	}
}
