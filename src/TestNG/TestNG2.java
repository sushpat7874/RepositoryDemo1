package TestNG;

import org.testng.annotations.Test;

public class TestNG2 {
	
		@Test(priority=-1,invocationCount=3)	//single test run multiple times
		public void test1() {
			System.out.println("A");
		}	
		
		@Test(enabled=false)					//skip the test
		public void test2() {
			System.out.println("B");
		}
		
		@Test(dependsOnMethods= {"test1","test1"})		//one test depends on another test result
		public void test3() {
			System.out.println("C");
		}
		
		@Test(timeOut=300)						//to fail the test 
		public void test4() throws InterruptedException {
			Thread.sleep(200);
			System.out.println("D");
			
			System.out.println("\n\tA\n"); 		// \t = Tab before A & \n = print A on next line
		}	
		
}