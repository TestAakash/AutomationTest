package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {
	WebDriver driver;
	public DetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
    WebElement addToCartButton;

    

    public void AddToCart(String HomeWindow) {
        addToCartButton.click();
    //    driver.close();
        driver.switchTo().window(HomeWindow);
     
    }
    
    
}

