package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        TakesScreenshot tk=(TakesScreenshot)driver;
        File src = tk.getScreenshotAs(OutputType.FILE);
        File dest= new File("D:\\Testing notes and concepts\\Selenium classes\\Ram.png");
        FileHandler.copy(src, dest);
        
        

	}

}
