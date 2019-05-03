package basic.meth;

public class A {

	
	public void test1() {
		String a  = "bharath";
		String b = new String("Bharath");
		
		System.out.println(a);
		System.out.println(a.equals(b));
		
		System.out.println(a.length());
		
		System.out.println(a.charAt(0));
		
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		
	}
	
	public void rev(String name) {
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		A a  = new A();
		a.test1();
		a.rev("bharath");
	}
}
