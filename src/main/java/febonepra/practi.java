package febonepra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.manage().window().maximize();
  driver.get("https://demoqa.com/alerts");
  webelement element = driver.findElement(By.ById)
  
  
  
	}

}
