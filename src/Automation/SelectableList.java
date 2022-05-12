package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableList {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/selectable.html");
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
        Actions acc= new Actions(driver);
        acc.clickAndHold(list.get(1)).release(list.get(4)).perform();
        

	}

}
