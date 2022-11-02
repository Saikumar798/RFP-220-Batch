package PractiseProblems;

import java.util.Scanner;

public class BusTicket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ticket booking Services");

		System.out.println("Enter the City you want to Book"); // enter the destination city
		String city = sc.next();

		System.out.println("Your age "); // age for booking the ticket

		int age = sc.nextInt();
		System.out.println("Enter The Seat Number "); // seat no according to the user input

		int seatnum = sc.nextInt(); // even number seats are leftsided

		if (seatnum % 2 == 0) {
			System.out.println(" Left Sided Window Seat is Booked ");
			// odd number seats are right sided
		} else {
			System.out.println(" Right Side Window Seat is Booked");

		}
		System.out.println("Your Ticket Booked To  " + city);

		System.out.println("  Thank You for Booking ");
		System.out.println("    Happy Journey ");
	}
}
