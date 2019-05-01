package basic.meth;

public class Sample1 {

	public void add(){
		int a = 10;
		int b = 20;
		int c = a +b;
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		// How to create the object
		//object, variable, reference
		Sample1 sam = new Sample1();
		sam.add();
	}
}
