package Auto;

import java.util.Scanner;

public class ErrorAndException {

	public static void main(String[] args) {

			Scanner Scan = new Scanner(System.in);
			System.out.println("Enter first no.");
			int a = Scan.nextInt();
			System.out.println("Enter second no.");
			int b = Scan.nextInt();
			
		try {
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Thank You!!");
			}
		
		catch(Exception e)
			{
			System.out.println("Invalid input");
			System.out.println(e);
			}
		finally {
		System.out.println("\nThe End");
				}
	
	}
}