package AppPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;



public class Main_file {
	public static WebDriver driver;
	

	
	@Test
	public void launchApp(){
		System.setProperty("webdriver.chrome.driver", "/home/aparnasp/Documents/Java/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://made.com");
		driver.findElement(By.className("closebutton")).click();	
	}
	
	@Test
	public void verifyMadeLogo(){
		HomePage home = new HomePage(driver);
		String madeLogo=home.MadeLogoM();
		AssertJUnit.assertEquals(madeLogo, "url");
	}
	
	/*@Test
	public void verifySignInBtn(){
		HomePage home = new HomePage(driver);
		String signBtn= home.SignInBtn();
		Assert.assertEquals(signBtn,"Sign in");		
	}*/
	
	@Test
	public void verifyJoinBtn(){
		HomePage home = new HomePage(driver);
	AssertJUnit.assertEquals(home.JoinBtn(),"Join");		
	}
	
	@Test
	public void verifyBasketBtn(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.BasketBtn(),"Basket");		
	}
	
	@Test
	public void verifyNewTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.NewTab(),"NEW");		
	}
	
	@Test
	public void verifySofasTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.SofasTab(),"Sofas");		
	}
	@Test
	public void verifyChairsTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.ChairsTab(),"Chairs");		
	}
	@Test
	public void verifyTablesTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.TablesTab(),"Tables");		
	}
	@Test
	public void verifyStorageTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.StorageTab(),"Storage");		
	}
	@Test
	public void verifyLightingTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.LightingTab(),"Lighting");		
	}
	@Test
	public void verifyBedroomTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.BedroomTab(),"Bedroom");		
	}
	@Test
	public void verifyKidsTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.KidsTab(),"Kids");		
	}
	@Test
	public void verifyAccessoriesTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.AccessoriesTab(),"Accessories");		
	}
	
	@Test
	public void verifyOutdoorTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.OutdoorTab(),"Outdoor");		
	}
	/*@Test
	public void verifyLast_ChanceTab(){
		HomePage home = new HomePage(driver);
		AssertJUnit.assertEquals(home.Last_ChanceTab(),"Last Chance");		
	}*/
	@Test
	public void verifyEmailId() throws InterruptedException{
		LoginPage login = new LoginPage(driver);
		AssertJUnit.assertEquals(login.EmailId(),"Email Address");		
	}
	/*@Test
	public void verifyPassword(){
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.Password(),"Password");		
	}*/
	@Test
	public void verifyLoginBtn(){
		LoginPage login = new LoginPage(driver);
		AssertJUnit.assertEquals(login.LogInBtn(),"button_label");		
	}
	@Test
	public void verifyLoginFunctionality(){
		LoginPage login = new LoginPage(driver);
		AssertJUnit.assertEquals(login.LoginFunctionality(), "My Account | made.com");

	}
	
	@AfterClass
	public void closebrowser(){
		driver.close();
		
	}
	

}
