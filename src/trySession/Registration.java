package trySession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	public static void main() throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tbodyid']")));
		
		WebElement signupBtn = driver.findElement(By.xpath("//*[@id='signin2']"));
		signupBtn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signInModal']/div/div")));
		
		WebElement usernameTxtbox = driver.findElement(By.xpath("//*[@id='sign-username']"));
		//WebElement emailTxtbox = driver.findElement(By.xpath("//*[@id='sign-email']"));
		WebElement passwordTxtbox = driver.findElement(By.xpath("//*[@id='sign-password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));
		
		usernameTxtbox.sendKeys("vince050824test3");
		//emailTxtbox.sendKeys("vince050824test@test.com");
		passwordTxtbox.sendKeys("testpass");
		
		Thread.sleep(1500);
		loginBtn.click();
		
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1500);
		alert.accept();
		
		driver.quit();
	}
}
