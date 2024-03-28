package main;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchApp  {	

	public static void main(String[] args) {
		
		//String SearchedProd = null;
		String TestProd ="Apple iPhone 15 (128 GB) - Green";
		String un="birle1802@gmail.com",pwd="$$TestAcc";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
      	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		LoginPage lp=new LoginPage(driver);
		lp.login(un, pwd);
		
		HomePage hp= new HomePage(driver);
		hp.verifyLogin();
		hp.searchProduct("apple iphone");
		SearchResultPage sp = new SearchResultPage(driver);
		String searchedProd = sp.clickOnProduct(TestProd);
	    String HomeWindow=sp.moveToDetailsPage();
		
	    DetailsPage dp=new DetailsPage(driver);
	    dp.AddToCart(HomeWindow);
	    hp.refresh_goToCart();
		
	    CartPage cp = new CartPage(driver);
	    cp.verifyProduct(searchedProd);
	    
	         	
	}}