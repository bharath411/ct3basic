package manasa;

import java.util.Scanner;

public class Studentavg {
	public static void main(String args[]) {
		System.out.println("Enter value for marks");
		Scanner obj= new Scanner(System.in);
		int marks=obj.nextInt();
		if(marks>=35 && marks<=50)
		{
			System.out.println("Grade C");
		}
		else if(marks>50 && marks<=70){
			System.out.println("Grade B");

		}
		else if(marks>70){
			System.out.println("Grade A");

		}
		
		else {
			System.out.println("Fail");
		}
			
	}
}
