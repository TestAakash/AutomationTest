package main;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	 WebDriver driver;
	 String HomeWindow=null,DetailsWindow=null;
	 
	 public SearchResultPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 @FindBy(xpath = "//div[contains(@class,'s-result-item')]//span[@class='a-size-medium a-color-base a-text-normal']")
     List<WebElement> searchResults;

    

    public String clickOnProduct(String productTitle) {
        String searchedProduct = null;
        for (WebElement result : searchResults) {
            if (result.getText().contains(productTitle)) {
                result.click();
                searchedProduct = result.getText();
                break;
            }
        }
        return searchedProduct;
    }

    
        public String moveToDetailsPage()
        {
        	Set<String> windows=driver.getWindowHandles();
    		Iterator<String> it= windows.iterator();
    		HomeWindow=it.next();
    	    DetailsWindow=it.next();
        	driver.switchTo().window(DetailsWindow);
        	return HomeWindow;
        	
        }
        
}

