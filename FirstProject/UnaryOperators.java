package FirstProject;

public class UnaryOperators {
public static void main(String[] args) {
	int num1 = 10;
	int num2 = 20;
	
	
	num1++; //post increment
	num2++;
	System.out.println(num1);
    System.out.println(num2);
    
    --num1; //pre decrement
    --num2;
    System.out.println(num1);
    System.out.println(num2);
    
    System.out.println(num1<=num2);
    System.out.println(num1>=num2);
    System.out.println(num1!=num2);
}
}