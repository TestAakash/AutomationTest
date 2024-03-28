package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='a-truncate-cut']")
    WebElement addedProductName;

    
   
   // public String getProductName() 
   // {
     //   return addedProductName.getText();
    //}
    public void verifyProduct(String searchedProd)
    {
    	
    if	(addedProductName.getText().contentEquals(searchedProd))
    	System.out.println("TestPass"+" added Product is searchedProd "+ searchedProd );
    
    else
    {	System.out.println("TestFail");}
      
         
        driver.quit();
    }    	
   

}




