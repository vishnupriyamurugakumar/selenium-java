package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"apple"})
	public void Apple1() {
		System.out.println("apple");
	}
	
	@Test(groups = {"apple"})
	public void Apple2() {
		System.out.println("apple");
	}
	
	@Test(groups = {"moto"})
	public void Moto1() {
		System.out.println("Moto");
	}
	
	@Test(groups = {"moto"})
	public void Moto2() {
		System.out.println("Moto");
	}
	
	@Test(groups = {"vivo"})
	public void Vivo1() {
		System.out.println("Vivo");
	}
	
	@Test(groups = {"vivo"})
	public void Vivo2() {
		System.out.println("Vivo");
	}
	
	@Test(groups = {"lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo");
	}
	
	@Test(groups = {"lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo");
	}
}
