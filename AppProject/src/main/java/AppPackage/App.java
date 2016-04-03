package AppPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	public void test12(){
		System.out.println("test12");
		WebDriver driver = new FirefoxDriver();
	}
	
	@BeforeTest
	public void beforetest1(){
		System.out.println("before test 1");
	}
	
	@AfterTest
	public void aftertest1(){
		System.out.println("after test 1");
	}
	
	@AfterMethod
	public void aftermethod1(){
		System.out.println("after method1");
	}
	@AfterSuite
	public void aftersuite1(){
		System.out.println("after suite1");
	}
	
	@Test
	public void test11(){
		System.out.println("test11");
	}
	
	@BeforeSuite
	public void beforesuite1(){
		System.out.println("before suite1");
	}
	
	@BeforeMethod
	public void beforemethod1(){
		System.out.println("before method1");
	}
	

}
