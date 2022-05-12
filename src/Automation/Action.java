package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/drop.html");
        WebElement findElement = driver.findElement(By.id("draggable"));
        WebElement findElement2 = driver.findElement(By.id("droppable"));
        Actions acc=new Actions(driver);
        acc.dragAndDrop(findElement, findElement2).perform();
        }

}
