package practiseProblemsDay3;

public class Car {

	private int noOfWheels = 4;
	private int speed = 100;
	private String name = "MyCar";

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int wheels) {
		this.noOfWheels = wheels;
	}

	public static void main(String[] args) {
		Car mycar = new Car();
		int wheels = mycar.getNoOfWheels();
		System.out.println("No of Wheels" + wheels);
		Car myCar = new Car(1);

	}


 Car( int a) {
	 this.speed =a ;
	
}
 public Car() {
	// TODO Auto-generated constructor stub
}

public int drive (int a) {
	return a;
	 
 }
}
