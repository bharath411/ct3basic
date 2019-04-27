package naveenkumarkb;

	public class nestedif {
		public static void main(String args[]) {
			int marks=52;
			if(marks<0 || marks>100) {
			System.out.println("Invalid Marks");
			}
			else if(marks>=40 && marks<=60) {
				System.out.println("Second Class");
			}
			else if(marks>=60 && marks<=80) {
			System.out.println("First Class");
			}
			else if(marks>=80 && marks<=100) {
			System.out.println("Distinction");
			}
	}
}
