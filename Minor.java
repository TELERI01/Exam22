package Exam;

import java.util.*;

public class Minor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age = 1;
		
		System.out.println("Enter Students age: ");
		
		age = scan.nextInt();
		
		
		if(age<18) {
			System.out.println("The student is a minor:");
		}
		if(age>=18) {
			System.out.println("The student is an adult!");
		}
		
	}
	
}
