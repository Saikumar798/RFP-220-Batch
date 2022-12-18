package practiseProblemsDay10;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	ArrayList<ContactsMain> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Contacts sc = new Contacts();
		System.out.println("Welcome to AddressBook");
		while (true) {
			System.out.println("\n 1.Enter new name \n2.Display address " + "\n3.exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 :
				sc.addStocks();
				break;
			case 2 :
				sc.DisplayContact();
				break;
			case 3 : {
				System.out.println("exiting");
				System.exit(0);
			}
			default : System.out.println("invalid input");
			}
		}
	}

	public void addStocks() {
		ContactsMain book = new ContactsMain();
		System.out.println("Enter the  name");
		book.setFirstName(scanner.next());
		
		System.out.println("Enter the Last Name");
		book.setLastName(scanner.next()); 

		System.out.println("Enter the Address");
		book.setAddress(scanner.next()); 

		System.out.println("Enter the City ");
		book.setCity(scanner.next());

		System.out.println("Enter the State");
		book.setState(scanner.next());

		System.out.println("Enter the Email Id");
		book.setEmail(scanner.next());

		System.out.println("Enter the ZipCode");
		book.setZipCode(scanner.nextInt());

		System.out.println("Enter the Phone Number");
		book.setPhoneNumber(scanner.nextInt());
		
	
		arrayList.add(book);
	}

	public void DisplayContact() {
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			ContactsMain s = arrayList.get(i);
			System.out.print(arrayList );
			
		}
	}


}
