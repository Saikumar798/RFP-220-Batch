package practiseProblemsDay3;

public class Student {
	private int rollNum;
	private String Name;
	private float pointer;
	char gender;
	long mobNum;
	boolean isAdult;
	Address address = new Address();

	@Override
	public String toString() {
		return "Student [RollNum=" + rollNum + "\n" + " Name=" + Name + "\n, Pointer=" + pointer + "\n" + " Gender="
				+ gender + "\n MobNum=" + mobNum + "\n" + " isAdult=" + isAdult + "]";
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getPointer() {
		return pointer;
	}

	public void setPointer(float pointer) {
		this.pointer = pointer;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = 'm';
	}

	public long getMobNum() {
		return mobNum;
	}

	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}

	public Address getAdd() {
		return address;
	}

	public void setAdd(Address add) {
		this.address = address;
	}

	public boolean isAdult() {
		return isAdult;
	}

	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	public static void main(String[] args) {
		Student student = new Student();
		Address ad = new Address();
		ad.setCity("vizag");
		System.out.println(ad);
		student.setName("Sai");
		student.setRollNum(20);
		student.setPointer(2);
		student.setGender('M');
		student.setMobNum(987456321);
		// student.address= new Address();
		student.address.setCity("Visakhapatnam");
		student.address.setPincode(530044);
//		student.address.setLocation(0);

		System.out.println(student);
		

	}

}

class Address {
	private String city;
	private long pincode;
	private String place;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", place=" + place + "]";
	}

	

}
