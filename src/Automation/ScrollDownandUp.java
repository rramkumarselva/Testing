package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/home.html");
        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement last = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[24]"));
        js.executeScript("arguments[0].scrollIntoView()", last);

	}

}
