package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
	    WebElement fram = driver.findElement(By.xpath("(//div[@id='wrapframe'])[1]//iframe"));
	    driver.switchTo().frame(fram);
	    driver.findElement(By.id("Click")).click();
	    driver.switchTo().defaultContent();
	    WebElement fram2 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]//iframe"));
	    driver.switchTo().frame(fram2);
	    driver.switchTo().frame("frame2");
	    driver.findElement(By.id("Click1")).click();
	   driver.switchTo().parentFrame();
	   driver.switchTo().defaultContent();
		

	}

}
