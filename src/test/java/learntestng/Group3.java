package learntestng;

import org.testng.annotations.Test;

public class Group3 {
	@Test(groups = "smoke")
	public void i() {
		System.out.println("Method I has been Executed");
	}
	@Test(groups="integration")
	public void j() {
		System.out.println("Method J has been Executed");
	}
	@Test(groups = "functional")
	public void k() {
		System.out.println("Method K has been Executed");
	}
	@Test(groups = "integration")
	public void l() {
		System.out.println("Method L has been Executed");
	}
}
