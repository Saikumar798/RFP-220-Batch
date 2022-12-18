package practiseProblemsDay7;

public class MethodOverridingDemo {

	class Animal {
		
		void walk() {
			System.out.println("walks");
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	}
	
	class Hen{
		void walk() {
			System.out.println("i");
		}
		
	}
}
