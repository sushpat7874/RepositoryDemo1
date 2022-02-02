package TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNG.ListenersNG.class)
public class ListenersImp {
	
		@Test
		public void Test1() {
				System.out.println("A");
			}
		
		@Test
		public void Test2() {
			int a=5;
			int b=445;
			System.out.println(a/b);
		}
		
		@Test (timeOut=1000)
		public void Test3() throws InterruptedException {
			Thread.sleep(2000);
			System.out.println("C");
		}
		
		@Test (dependsOnMethods="Test3")
		public void Test4() {
			System.out.println("D");
		}
}