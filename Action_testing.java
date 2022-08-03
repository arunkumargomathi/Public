	package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_testing {
	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Playground\\seleniumpro\\Driverchrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
	
	Actions a = new Actions (driver);
	WebElement mob = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	a.moveToElement(mob).build().perform();      // 1
//	a.click(mob).build().perform();                  
	a.contextClick(mob).build().perform();         
	
	
	}

}
