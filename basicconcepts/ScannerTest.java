package basicconcepts;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//in--read, out--write
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your pin");
		int pin =sc.nextInt();
		System.out.println("name :"+name);
		System.out.println("pin :"+pin);
	}


}
