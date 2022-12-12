package Exam;

import java.text.DecimalFormat;
import java.util.*;

public class Final34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat(".00");
		
		double a, b, c;
		
		System.out.println("Enter a floating point number: ");
		
		a = scan.nextDouble();
		
		b = Math.sqrt(a);
		
		System.out.println("Square: " + d1.format(b));
		
		
		

	}

}
