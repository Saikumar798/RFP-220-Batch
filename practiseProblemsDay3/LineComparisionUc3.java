package practiseProblemsDay3;

import java.util.Scanner;

public class LineComparisionUc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Co-ordinates of First line1 ");
		System.out.println("Enter the Co-ordinates of x1 and y1 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("Enter the Co-ordinates of x2 and y2 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		Double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println();
		
		System.out.println("Enter the Co-ordinates of Second line2 ");
		System.out.println("Enter the Co-ordinates of x3 and y3 : ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.println("Enter the Co-ordinates of x4 and y4 : ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		Double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		
		System.out.println("Length of the first Line1 is : " + length1 + " units");
		System.out.println("Length of the second Line2 is : " + length2 + " units");
		System.out.println();
		
		if (length1 > length2 )
			System.out.println("Length of Line 1 is Greater than Line 2 ");
		else if (length1 < length2)
			System.out.println("Length of Line 1 is Less than Line 2 ");
		else
			System.out.println("Both lines are Equal in length");

	}

}
