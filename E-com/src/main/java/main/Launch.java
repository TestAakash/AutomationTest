
//All steps in one page 


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



public class Launch {	
	
	public static void main(String[] args) {
/*		
		String SearchedProd = null;
		WebDriver driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();		
      	driver.get("https://www.amazon.in/");
      	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("birle1802@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("$$TestAcc");
		driver.findElement(By.id("signInSubmit")).click();	
    	String UserName=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		System.out.println(UserName);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	

	List<WebElement> name= driver.findElements(By.xpath("//div[contains(@class,'s-result-item')]//span[@class='a-size-medium a-color-base a-text-normal']"));
    int Count =1;
	for(WebElement name1:name)
    {
    	System.out.println(	name1.getText());
    	if(name1.getText().contains("Apple iPhone 15 (128 GB) - Green"))
    			{
    		//driver.findElement(By.xpath("//div[contains(@class,'s-result-item')]//span[@class='a-button a-button-primary a-button-icon']")).click();
    		driver.findElement(By.xpath("//button[@id='a-autoid-"+Count+"-announce']")).click();
    		break;
    			}
    	Count++;
    	}
	
	}

	

		List<WebElement> name= driver.findElements(By.xpath("//div[contains(@class,'s-result-item')]//span[@class='a-size-medium a-color-base a-text-normal']"));
	    		for(WebElement name1:name)
	    {
	    	
	    	if(name1.getText().contains("Apple iPhone 15 (128 GB) - Green"))
	    	{
	    		//to get details
	    		name1.click();
	    		 SearchedProd=name1.getText();
            }
	     }
		
	System.out.println(driver.getWindowHandles());
	    		
	    		Set<String> windows=driver.getWindowHandles();
	    		Iterator<String> it= windows.iterator();
	    		String HomeWindow=it.next();
	    		String DetailsWindow=it.next();
	    		System.out.println(HomeWindow);
	    		System.out.println(DetailsWindow);
	            driver.switchTo().window(DetailsWindow);
	          
	          
	            driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	        	
	        //Step 5    
	            driver.switchTo().window(HomeWindow);  
	        //step 6
	            driver.navigate().refresh();
	            //cart displays added product
	            driver.findElement(By.xpath("//a[@id='nav-cart']")).click();   
	            //Assert
	          String ProdName= driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).getText();
	          if(ProdName.contentEquals(SearchedProd)) 
	          {
	        	  System.out.println("pass");
	          }
*/	
	}}
	
	