package basic.meth;

public class SecondExample {

	
	public void add() {
		int a = -10;
		int b = 20;
		int c = a + b ;
		System.out.println(c);
	}
	
	
	public void add(int a) {
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public void add(int a,int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public int add(int a,String b){
		int c = a ;
		System.out.println(b);
		System.out.println(c);
		return c;
	}
	public int add(String a,int b){
		System.out.println(a);
		System.out.println(b);
		return 10;
	}
	
	// method , # parameters, order of parameters 
	//method over loading
}
