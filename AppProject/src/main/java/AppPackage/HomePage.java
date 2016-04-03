package AppPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static WebDriver driver;
	
	By MadeLogo = By.id("logo");
	//static By MadeLogo = By.xpath(".//*[@id='logo']/img");
//	By SignIn = By.cssSelector(".top-right.level-0.account.sign-in.account-loggedout>span");//)xpath(".//*[@id='utility-links']/div[2]/a[1]/span");
	By SignIn = By.xpath("//*[@id='utility-links']/div[2]/a[1]/span");
	By Join = By.xpath(".//*[@id='utility-links']/div[2]/a[2]/span");
	By Basket = By.xpath(".//*[@id='utility-links']/a/span[1]");
	By New = By.xpath(".//*[@id='nav-new-in']/a/span");
	By Sofas = By.xpath(".//*[@id='nav-sofas-and-armchairs']/a/span");
	By Chairs = By.xpath(".//*[@id='nav-chairs']/a");
	By Tables = By.xpath(".//*[@id='nav-tables']/a/span");
	By Storage = By.xpath(".//*[@id='nav-storage']/a/span");
	By Lighting = By.xpath(".//*[@id='nav-lighting']/a/span");
	By Bedroom = By.xpath(".//*[@id='nav-beds']/a/span");
	By Kids = By.xpath(".//*[@id='nav-kids']/a/span");
	By Accessories = By.xpath(".//*[@id='nav-homewares-accessories']/a/span");
	By Outdoor = By.xpath(".//*[@id='nav-outdoor']/a/span");
//	By Last_Chance = By.xpath(".//*[@id='nav-last-chance']/a/span");
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public String MadeLogoM(){
		String logo = driver.findElement(MadeLogo).getAttribute("itemprop");
		return logo;	
	}
	
	public String SignInBtn(){
		String text = driver.findElement(SignIn).getText();
		return text;
	}
	
	public String JoinBtn(){
		String text = driver.findElement(Join).getText();
		return text;
	}
	
	public String BasketBtn(){
		String text = driver.findElement(Basket).getText();
		return text;
	}
	
	public String NewTab(){
		String text = driver.findElement(New).getText();
		return text;
	}
	public String SofasTab(){
		String text = driver.findElement(Sofas).getText();
		return text;
	}
	public String ChairsTab(){
		String text = driver.findElement(Chairs).getText();
		return text;
	}
	public String TablesTab(){
		String text = driver.findElement(Tables).getText();
		return text;
	}
	public String StorageTab(){
		String text = driver.findElement(Storage).getText();
		return text;
	}
	public String LightingTab(){
		String text = driver.findElement(Lighting).getText();
		return text;
	}
	public String BedroomTab(){
		String text = driver.findElement(Bedroom).getText();
		return text;
	}
	public String KidsTab(){
		String text = driver.findElement(Kids).getText();
		return text;
	}
	public String AccessoriesTab(){
		String text = driver.findElement(Accessories).getText();
		return text;
	}
	public String OutdoorTab(){
		String text = driver.findElement(Outdoor).getText();
		return text;
	}
	/*
	public String Last_ChanceTab(){
		String text = driver.findElement(Last_Chance).getText();
		return text;
	}*/
}
