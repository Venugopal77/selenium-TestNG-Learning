package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationEx {

	@Test
	@Parameters("Name")
	public void EntertheName(String name) {
		System.out.println("The name is "+ name);
	}
}
