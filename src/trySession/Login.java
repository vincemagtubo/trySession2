package trySession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void main() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tbodyid']")));
		
		WebElement loginAccBtn = driver.findElement(By.xpath("//*[@id='login2']"));
		loginAccBtn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='logInModal']/div/div")));
		
		WebElement usernameTxtbox = driver.findElement(By.xpath("//*[@id='loginusername']"));
		WebElement passwordTxtbox = driver.findElement(By.xpath("//*[@id='loginpassword']"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]"));
		
		String userN = "vince050824test3";
		String passW = "testpass";
		
		usernameTxtbox.sendKeys(userN);
		passwordTxtbox.sendKeys(passW);
		
		Thread.sleep(1500);
		loginBtn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome ' + userN)]")));
		
		driver.quit();
	
	}
}