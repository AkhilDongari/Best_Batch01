package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreAndPostCondition {
	
 public static WebDriver driver ;
 
 @BeforeMethod
 public void preCondition() {
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 }
 @AfterMethod
 public void postCondition() {
	 driver.manage().window().minimize();
	 driver.quit();
 }
 @Test(priority = 1)
	public void loginToActiTime() throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		Thread.sleep(1000);
		WebElement passwordTextField = driver.findElement(By.name("p"));
		passwordTextField.sendKeys("manager");
		Thread.sleep(1000);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
		Thread.sleep(3000);
	}
	@Test(priority = 2, dependsOnMethods = "loginToActiTime")
	public void loginToVtiger() throws Throwable {
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(1000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		Thread.sleep(1000);
		usernameTextField.sendKeys("admin");
		Thread.sleep(1000);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(1000);
		passwordTextField.sendKeys("Test@123");
		Thread.sleep(1000);
		WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.submit();
		Thread.sleep(1000);
	}
}
