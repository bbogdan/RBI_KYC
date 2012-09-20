package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tools.AbstractPages;

public class AlfrescoLoginPage extends AbstractPages{

	public AlfrescoLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement userpassInput;
	
	@FindBy(id = "btn-login")
	private WebElement loginButton;
	
	

	public void performLogin(String userName, String userPass){
		element(usernameInput).waitUntilVisible();
		element(userpassInput).waitUntilVisible();
		
		usernameInput.sendKeys(userName);
		userpassInput.sendKeys(userPass);
		
		element(loginButton).waitUntilVisible();
		loginButton.click();
	}
}
