package AppPackage;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {	
	
	public static WebDriver driver;
	
//	By Email = By.xpath(".//*[@id='email'");
	By Email = By.id("email");
	By Password = By.xpath(".//*[@id='pass']");
	By Sign_in = By.xpath("//*[@id='send2']/span");
//	By Sign_in= By.xpath(".//*[@id='send2']");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	@Test
	public String EmailId() throws InterruptedException{
		HomePage home = new HomePage(driver);
		Thread.sleep(5000);
		driver.findElement(home.SignIn).click();
	
		String txt = driver.findElement(Email).getAttribute("title");
		return txt;	
	}
	@Test
	public String Password(){
		String txt = driver.findElement(Password).getAttribute("title");
		return txt;	
	}
	
	@Test
	public String LogInBtn(){
		String txt = driver.findElement(Sign_in).getAttribute("class");
		return txt;	
	}
	
	@Test
	public String LoginFunctionality(){
		driver.findElement(Email).sendKeys("acharya.aparna@gmail.com");
		driver.findElement(Password).sendKeys("password1");
		driver.findElement(Sign_in).click();
		String txt = driver.getTitle();
		return txt;	
	}

}
