package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority=0)
	public void StartCar() {
		System.out.println("Start Car");
	}
	
	@Test(priority=1)
	public void PutFirstGear() {
		System.out.println("Put First Gear");
	}

	@Test(priority=2)
	public void PutSecondGear() {
		System.out.println("Put Second Gear");
	}

	@Test(priority=3)
	public void PutThirdGear() {
		System.out.println("Put Third Gear");
	}

	@Test(priority=4)
	public void PutFourthGear() {
		System.out.println("Put Fourth Gear");
	}
}
