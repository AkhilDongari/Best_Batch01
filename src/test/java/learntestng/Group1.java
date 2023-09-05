package learntestng;

import org.testng.annotations.Test;

public class Group1 {
@Test(groups = "functional")
	public void a() {
		System.out.println("Method A has been Executed");
	}
	@Test(groups = "integration")
	public void b() {
		System.out.println("Method B has been Executed");
	}
	@Test(groups = "smoke")
	public void c() {
		System.out.println("Method C has been Executed");
	}
	@Test(groups = "functional")
	public void d() {
		System.out.println("Method D has been Executed");
	}
}
