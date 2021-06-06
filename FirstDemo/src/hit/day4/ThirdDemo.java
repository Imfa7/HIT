package hit.day4;

import java.util.Scanner;

public class ThirdDemo {
	

	public static void main(String [] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a value of x:");
		int x=scan.nextInt();
		
		System.out.println("Enter a value of y");
		int y=scan.nextInt();

		System.out.println("Addition of Two Numbers is:"+ (x+y));
		
		System.out.println("Enter a value of i:");
		int i=scan.nextInt();
		
		System.out.println("Enter a value of j:");
		int j=scan.nextInt();
	
		System.out.println("Subtraction of Two Numbers is:"+ (i-j));
	}

}
