package naveenkumarkb;

public class MethodOverloading {
	public void Mul() {
		int a=3;
		int b=4;
		int c=a*b;
	System.out.println(c);
	}
	public void Mul(int a) {
		int b=5;
		int c=a*b;
	System.out.println(c);
	}
	public void Mul(int a, int b) {
		int c=a*b;
	System.out.println(c);
	}
	public void Mul(String a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void Mul(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void Mul(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
