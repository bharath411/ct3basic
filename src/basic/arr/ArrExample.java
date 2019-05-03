package basic.arr;

public class ArrExample {

	public void test1() {
		
		int a = 10;
		int b[] = {10,20,30};
		String s[] = {"bha","abc","xyz","yes"};
		String s1[] = new String[5];
		int in[] = new int[2];
		
		System.out.println(s.length);
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
	public static void main(String[] args) {
		ArrExample ex = new ArrExample();
		ex.test1();
	}
}
