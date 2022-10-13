package automation_code_9th_October_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyfirstAutomationCode {

	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();	
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://facebook.com");
		

		
				
	
		
		
	

	}

}
