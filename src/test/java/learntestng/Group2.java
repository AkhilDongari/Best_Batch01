package learntestng;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = "integration")
	public void e() {
		System.out.println("Method E has been Executed");
	}
	@Test(groups = "adhoc")
	public void f() {
		System.out.println("Method F has been Executed");
	}
	@Test(groups = "integration")
	public void g() {
		System.out.println("Method G has been Executed");
	}
	@Test(groups = "functional")
	public void h() {
		System.out.println("Method H has been Executed");
	}
}
