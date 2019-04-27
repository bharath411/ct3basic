package basic;

public class IfExample {

	
	public static void main(String args[]) {
		
		int marks = 110;
		
		if(marks>=40) {
			if(marks>100){
				System.out.println("In valid");
			}else {
				System.out.println("PASS");
			}
		} else {
			if(marks<0){
				System.out.println("In valid");
			}else {
				System.out.println("FAIL");
			}
		} 
		
		if(marks < 0 || marks>100) {
			System.out.println("INVALID");
		}else if(marks>40){
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
	}
}
