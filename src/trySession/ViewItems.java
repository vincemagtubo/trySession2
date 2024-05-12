package trySession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewItems {

	public static void main() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tbodyid']")));
		System.out.println("OK...");
		
		WebElement carouselCont = driver.findElement(By.xpath("//*[@id='carouselExampleIndicators']"));
		System.out.println("OK...");
		WebElement carouselPhone = driver.findElement(By.xpath("//img[@class='d-block img-fluid'][@id='phone-caro-img']"));
		System.out.println("OK...");
		WebElement carouselLaptop = driver.findElement(By.xpath("//img[@class='d-block img-fluid'][@id='lt-caro-img']"));
		System.out.println("OK...");
		WebElement carouselMonitor = driver.findElement(By.xpath("//img[@class='d-block img-fluid'][@id='mon-caro-img']"));
		System.out.println("OK...");
		
		if (carouselCont.isDisplayed()) 
			System.out.println("Carousel container is present");
			if (carouselPhone.isDisplayed()) {
				System.out.println("Carousel phone image is present");
				if (carouselLaptop.isDisplayed()) {
					System.out.println("Carousel laptop image is present");
					if (carouselMonitor.isDisplayed()) {
						System.out.println("Carousel monitor image is present");
					} else { System.out.println("Monitor image is not present"); }
				} else { System.out.println("Laptop image is not present"); }
			} else { System.out.println("Phone image is not present"); }
		  { System.out.println("Carousel container is not present"); 
		
		
		Boolean categoryCont = driver.findElement(By.xpath("//*[@id='contcont']/div/div[1]/div']")).isDisplayed();
		System.out.println("Category container is " +categoryCont);
		
		Boolean catPhone = driver.findElement(By.xpath("//*[@id='itemc'][1]")).isDisplayed();
		System.out.println("Category container is " +catPhone);
		
		Boolean catLaptop = driver.findElement(By.xpath("//*[@id='itemc'][2]")).isDisplayed();
		System.out.println("Category container is " +catLaptop);
		
		Boolean catMonitor = driver.findElement(By.xpath("//*[@id='itemc'][3]")).isDisplayed();
		System.out.println("Category container is " +catMonitor);		
		
		
		WebElement itemImage = driver.findElement(By.xpath("//*[@class='card-img-top img-fluid']"));
		if (itemImage.isDisplayed()) {
			System.out.println("Item's image is present");
		} else { System.out.println("Item's image is not present"); } 
		
		
		WebElement itemName = driver.findElement(By.xpath("//*[@class='hrefch']"));
		if (itemName.isDisplayed()) {
			System.out.println("Item's name is present");
		} else { System.out.println("Item's name is not present"); } 
		
		
		WebElement itemPrice = driver.findElement(By.xpath("//div[@class='card-block']/h5"));
		if (itemPrice.isDisplayed()) {
			System.out.println("Item's price is present");
		} else { System.out.println("Item's price is not present"); } 
		
		
		WebElement itemDesc = driver.findElement(By.xpath("//div[@class='card-block']/p[@class='card-text']"));
		if (itemDesc.isDisplayed()) {
			System.out.println("Item's description is present");
		} else { System.out.println("Item's description is not present"); } 
			
		driver.quit();

	}
	}
}
