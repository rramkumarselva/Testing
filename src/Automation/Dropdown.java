package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        //WebElement dropdown = driver.findElement(By.id("dropdown1"));
        WebElement dropdown = driver.findElement(By.xpath("(//div[@class='example']//select)[6]"));
        Select sc= new Select(dropdown);
        boolean multiple = sc.isMultiple();
        System.out.println(multiple);
        sc.selectByIndex(1);
        sc.selectByValue("2");
        sc.selectByVisibleText("Loadrunner");
	}

}
