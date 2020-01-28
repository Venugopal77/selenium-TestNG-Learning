package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/* There were 4 group of mobile brands RedMi, Nokia, Apple, Oneplus.
	 * we need to test only RedMi and Oneplus Mobiles */
	
	@Test(groups = "RedMi")
	public void RedMi1() {
		System.out.println("Testing RedMi Mobile");
	}
	
	@Test(groups = "RedMi")
	public void RedMi2() {
		System.out.println("Testing RedMi Mobile");
	}
	
	@Test(groups = "Nokia")
	public void Nokia1() {
		System.out.println("Testing Nokia Mobile");
	}
	
	@Test(groups = "Nokia")
	public void Nokia2() {
		System.out.println("Testing Nokia Mobile");
	}
	
	@Test(groups = "Apple")
	public void Apple1() {
		System.out.println("Testing Apple Mobile");
	}
	
	@Test(groups = "Apple")
	public void Apple2() {
		System.out.println("Testing Apple Mobile");
	}
	
	@Test(groups = "OnePlus")
	public void OnePlus1() {
		System.out.println("Testing OnePlus Mobile");
	}
	
	@Test(groups = "OnePlus")
	public void OnePlus2() {
		System.out.println("Testing OnePlus2 Mobile");
	}
}
