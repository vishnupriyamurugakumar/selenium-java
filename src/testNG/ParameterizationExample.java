package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("name")
	public void PrintName(String name) {
		System.out.println("The name is :" + name);	
	}

}
