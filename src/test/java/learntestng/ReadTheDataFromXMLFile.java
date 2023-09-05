package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadTheDataFromXMLFile {
	public static WebDriver driver;

	
	@Test
	@Parameters({ "browserName", "url", "username", "password" })
	public void loginToActiTime(String browserName, String url, String username, String password) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(username);
		WebElement passwordTextFiled = driver.findElement(By.name("pwd"));
		passwordTextFiled.sendKeys(password);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
	}
}
