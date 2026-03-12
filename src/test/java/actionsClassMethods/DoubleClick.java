package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		WebElement textfield = driver.findElement(By.id("clickable"));
		Actions act = new Actions(driver);
		act.doubleClick(textfield).perform();
		String txt = driver.findElement(By.id("click-status")).getText();
		System.out.println(txt);
	}
}
