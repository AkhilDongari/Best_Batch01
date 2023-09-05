package learntestng;

import org.testng.annotations.Test;

public class Group4 {
	@Test(groups = "smoke")
	public void m() {
		System.out.println("Method M has been Executed");
	}
	@Test(groups = "integration")
	public void n() {
		System.out.println("Method N has been Executed");
	}
	@Test(groups = "smoke")
	public void o() {
		System.out.println("Method O has been Executed");
	}
	@Test(groups = "functional")
	public void p() {
		System.out.println("Method P has been Executed");
	}
}
