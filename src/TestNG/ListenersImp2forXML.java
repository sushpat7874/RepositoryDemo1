package TestNG;

import org.testng.annotations.Test;

//  Note- we can use listeners for whole package as well as multiple classes at a time 
//	with the help of xml; 1st need to convert class into xml(right click>TestNG>convert to TestNG);
public class ListenersImp2forXML {

	@Test
	public void Test11() {
			System.out.println("AA");
		}
	
	@Test
	public void Test22() {
		int a=5;
		int b=445;
		System.out.println(a/b);
	}
	
	@Test (timeOut=1000)
	public void Test33() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("CC");
	}
	
	@Test (dependsOnMethods="Test3")
	public void Test44() {
		System.out.println("DD");
	}
}
