package Exam;

import java.util.*;

public class Workday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char choice;

		do {
			
			System.out.println("Select any day of the week! ");
			choice = scan.next().charAt(0);
			switch(choice) {
			
			case 'm':
				System.out.println("Monday");
				break;
			case 'T':
				System.out.println("Tuesday");
				break;
			case 'w':
				System.out.println("Wednesday");
				break;
			case 't':
				System.out.println("Thursday");
				break;
			case 'f':
				System.out.println("Friday");
				break;
			case 's':
				System.out.println("Saturday");
				break;
			case 'S':
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Holiday");
				break;
			
			
			
			}
			
		}while(choice!='q');

	}

}
