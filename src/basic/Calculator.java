package basic;

public class Calculator { 
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b ;
		System.out.println("c");
		System.out.println(c);
		System.out.println("d");
	}
	
	public void add1(int a) {
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public void add2(int a,int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public int add3(int a,int b){
		int c = a + b;
		System.out.println(c);
		return c;
	}
	
	public double avg(double sum) {
		double c = sum /2;
		return c;
	}
	
}
