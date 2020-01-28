package testNG;

import org.testng.annotations.Test;

public class DependencyTask {

	//Test add to cart
	//test is site is available
	
	@Test(enabled = false )
	public void TestSiteAvailablity() {
		System.out.println("Site is availabe?");
	}
	
	@Test(dependsOnMethods = "TestSiteAvailablity")
	public void Login() {
		System.out.println("Login page is working");
	}
	
	@Test(dependsOnMethods = "Login")
	public void AddToCart() {
		System.out.println("Add to cart is working");
	}
}
