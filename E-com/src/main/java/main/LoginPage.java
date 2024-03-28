package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	  WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(id = "nav-link-accountList-nav-line-1")
	    WebElement accountLink;
	    
	    @FindBy(id="ap_email")
	    WebElement emailField;

	    @FindBy(id="continue")
	    WebElement continueButton;

	    @FindBy(id="ap_password")
	    WebElement passwordField;

	    @FindBy(id = "signInSubmit")
	    WebElement signInButton;

	
	    public void login(String email, String password) {
	    	accountLink.click();    
	    	emailField.sendKeys(email);
	        continueButton.click();
	        passwordField.sendKeys(password);
	        signInButton.click();
	    }
	}
	

