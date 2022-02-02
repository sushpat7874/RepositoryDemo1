package TestNG;

import org.testng.annotations.Test;

public class TestNG1priority {

	@Test(priority=3)			//priority changes high to low w.r.t. - to + values
	public void test1() {
		System.out.println("A");
	}	
		
	@Test(priority=0)
	public void test2() {
		System.out.println("B");
	}
		
	@Test(priority=-1)
	public void test3() {
		System.out.println("C");
	}
	
	@Test(priority=-10)
	public void test4() {
		System.out.println("D");
	}	
		
}