package hit.day4;

import java.util.Scanner;

public class FourthDemo {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		
		while (true) {
		System.out.println("Enter a value Lesser than 10:");
		
		int x=scan.nextInt();
		 if(x>10) {
			 System.out.println("Enter a value less than 10:"+ x);
			 System.out.println("It is not Less than 10:");
		 }
		 else {
			 System.out.println("WOW, You have entered less than 10, CONGRATS..!!! ");
		 	  }
		}
		
	}

}
