package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		@SuppressWarnings("unused")
		WebElement ele = driver.findElement(By.xpath("//h3[text()='My account']"));
		Actions act = new Actions(driver);
		//act.scrollToElement(ele).perform();
		act.scrollByAmount(0, 800).perform();
		
		System.out.println("2nd commit test");
		System.out.println("main branch");
	}
}
