
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver", "C:/Users/DELL/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/");
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
