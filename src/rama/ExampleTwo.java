package rama;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		System.out.println("Enter Marks: ");
	   Scanner s=new Scanner(System.in);
	   
		int marks =s.nextInt();
		
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
