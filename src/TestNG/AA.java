package TestNG;

import org.testng.annotations.Test;

public class AA {

	int i = 1;
	static int s=6;
@Test
	public static void ABC() {
		
		int a=20;
		double b=8;
		
		System.out.println(a%b);

		AA ii = new AA();
//		System.out.println(i);
		System.out.println(s);
	}

}