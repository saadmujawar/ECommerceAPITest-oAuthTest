import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		/*
		 * //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * https://rahulshettyacademy.com/angularpractice/
		 * //driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='checkBoxOption1']")).isSelected());
		 * 
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * //Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='checkBoxOption1']")).isSelected());
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='checkBoxOption1']")).isSelected()); //count the no. of check
		 * boxes System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size());
		 */
		//assignment2
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys("Saad");
		driver.findElement(By.name("email")).sendKeys("saad@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("saad123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Dropdown);
		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='form-check form-check-inline'])[1]")).isSelected());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("12/12/1997");
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		//driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		
		/*
		 * driver.get("https://rahulshettyacademy.com/angularpractice/");
		 * 
		 * driver.findElement(By.name("name")).sendKeys("rahul");
		 * 
		 * driver.findElement(By.name("email")).sendKeys("hello@abc.com");
		 * 
		 * driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		 * 
		 * driver.findElement(By.id("exampleCheck1")).click();
		 * 
		 * WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		 * 
		 * Select abc = new Select(dropdown);
		 * 
		 * abc.selectByVisibleText("Female");
		 * 
		 * driver.findElement(By.id("inlineRadio1")).click();
		 * 
		 * driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		 * 
		 * driver.findElement(By.cssSelector(".btn-success")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(".alert-success")).
		 * getText());
		 */
		
		

	}

}
