package PractiseProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, number, temp, sum = 0;
		System.out.println("Enter 3 Digit Number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		number = num;
		for (; number != 0; number /= 10) {
			temp = number % 10;
			sum = sum + temp * temp * temp;
		}
		
		if (sum == num)
			System.out.println(num + " is an Armstrong number");
		
		else
			System.out.println(num + " is not an Armstrong number");
	}
}