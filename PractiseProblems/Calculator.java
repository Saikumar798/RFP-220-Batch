package PractiseProblems;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		char operator;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = sc.nextInt();

		System.out.print("Enter Second number: ");
		num2 = sc.nextInt();

		System.out.print("Enter an operator (+, -, *, /, %): ");
		operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;

		case '%':
			result = num1 % num2;
			break;

		default:
			System.out.printf("Error! Enter correct operator");
			return;
		}
		System.out.print("The result is:" + result);

	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
}
