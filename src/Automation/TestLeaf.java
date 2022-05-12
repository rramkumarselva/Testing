package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver .get("http://leafground.com/pages/frame.html");
		String title = driver.getTitle();
		System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    driver.close();
	    
	     

	}

}
