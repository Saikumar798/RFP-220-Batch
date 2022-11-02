package PractiseProblems;

import java.util.Scanner;

public class CheckClassPercentage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage");
		int percentage = sc.nextInt();

		if (percentage >= 75) {
			System.out.println("Distinction");

		} else if (percentage >= 60) {
			System.out.println("First Class");

		} else if (percentage >= 50) {
			System.out.println("Second Class");

		} else if (percentage < 50) {
			System.out.println("Better Luck Next Time");
		}
	}
}