package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name1 = "vishnu" ;
	String name2 = "priya" ;
	Boolean value = true ;
	Boolean value1 = false ;
	
	@Test
	public void CheckEqual1() {
		Assert.assertEquals(name1, "vishnu");
	}
	
	@Test
	public void CheckEqual2() {
		Assert.assertNotEquals(name2, "Priya");
	}

	@Test
	public void CheckTrue() {
		Assert.assertTrue(value, "correct");
	}
	
	@Test
	public void CheckFalse() {
		Assert.assertFalse(value1, "correct");
	}
	
	@Test
	public void CheckWrongExpectation() {
		Assert.assertFalse(value, "wrong");
	}
}

