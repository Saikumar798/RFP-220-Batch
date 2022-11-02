package PractiseProblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int num = sc.nextInt();
        int i;
		int factorial = 1;

		for ( i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
