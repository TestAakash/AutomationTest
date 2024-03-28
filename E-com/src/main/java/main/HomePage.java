package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 WebDriver driver;

	 public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "nav-link-accountList-nav-line-1")
	    WebElement accountLink;

	    @FindBy(id = "twotabsearchtextbox")
	    WebElement searchBox;

	    @FindBy(id = "nav-search-submit-button")
	    WebElement searchButton;

	    @FindBy(xpath = "//a[@id='nav-cart']")
	    WebElement cartLink;


	    
	    public void verifyLogin() {
	    	String userName= accountLink.getText();
	        System.out.println(userName);
	        if (userName.contentEquals("Hello, TestAccount"))
	       System.out.println("Login Verified"); 		
	    }

	    public void searchProduct(String productName) {
	        searchBox.sendKeys(productName);
	        searchButton.click();
	    }
	
	    public void refresh_goToCart()
	    {
	    	 driver.navigate().refresh();
	    	 cartLink.click();
	    	 
	    }
	    

}



