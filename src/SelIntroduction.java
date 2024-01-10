import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//chromedriver.exe->Chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:/work/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/work/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:/work/msedgedriver.exe");
		
		//webdriver.chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
