package rama;

public class ExampleOne {

	public static void main(String[] args) {
		int marks=90;
		
		if (marks>=40) {
			if (marks>=40 && marks<=55) {
			System.out.println("grade d");
			}
			else if (marks>=56 && marks <=65) {
			System.out.println("grade c");
			}
			else if(marks>=66 && marks <=75) {
				System.out.println("grade b");
			}
			
				else if(marks>=76 && marks<=100) {
					System.out.println("grade a");	
				}
				else {
					System.out.println("Invalid marks");
				}
				
			
			
          		}
		else
		{
			System.out.println("Fail");
		}
			}
}