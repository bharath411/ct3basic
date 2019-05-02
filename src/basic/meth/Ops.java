package basic.meth;

public class Ops extends Abc{

	//method overriding
	public void verify() {
		System.out.println("I am verify Method in Ops");
	}
	
	public static void main(String[] args) {
		Ops o = new Ops();
		o.verify();
		System.out.println(o.name);
	}
}
