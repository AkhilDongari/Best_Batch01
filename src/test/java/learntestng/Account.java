package learntestng;

import org.testng.annotations.Test;

public class Account {
@Test(priority = 1)
	public void createAccount() {
		System.out.println("createAccount");
	}
 @Test(priority = 2, dependsOnMethods = "createAccount")
	public void modifyAccount() {
		System.out.println("modifyAccount");
	}
	@Test(priority = 3, dependsOnMethods = {("createAccount"),("modifyAccount")}, enabled = false)
	public void deleteAccount() {
		System.out.println("deleteAccount");
	}
}
