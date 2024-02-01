package febonepra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocmplt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/auto-complete");
		
		WebElement autocmplt = driver.findElement(By.className("auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\""));

	autocmplt.sendKeys("red");
	
	}

}
