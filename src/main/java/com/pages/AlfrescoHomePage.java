package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tools.AbstractPages;

public class AlfrescoHomePage extends AbstractPages{

	public AlfrescoHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "global_x002e_header_x0023_default-app_my-dashboard-button")
	private WebElement dashboardButton;
	
	public void clickOnDashboard(){
		element(dashboardButton).waitUntilVisible();
		dashboardButton.click();
	}

}
