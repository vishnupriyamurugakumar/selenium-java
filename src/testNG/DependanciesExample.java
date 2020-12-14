package testNG;

import org.testng.annotations.Test;

public class DependanciesExample {

	@Test(enabled =true)
	public void highSchool() {
		System.out.println("High school");	
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecSchool() {
		System.out.println("Higher Sec school");	
	}

	@Test(dependsOnMethods = "higherSecSchool")
	public void engineeringCollege() {
		System.out.println("Engineering college");	
	}
}
