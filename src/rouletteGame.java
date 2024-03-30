import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
import java.util.ArrayList;


public class rouletteGame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Selenium Course\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://csgoempire.com/roulette");
		
		//Insert your test automation test cases here
		
		driver.quit();
	}
}