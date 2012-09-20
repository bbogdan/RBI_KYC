package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tools.AbstractPages;

public class AlfrescoRepositoryPage extends AbstractPages {

	public AlfrescoRepositoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "global_x002e_header_x0023_default-app_repository-button")
	private WebElement repositoryButton;
	
	@FindBy (css = "td#ygtvt6 > a")
	private WebElement sitesFolder;
	
	@FindBy (id = "ygtvlabelel6")
	private WebElement sitesRepositoryText;
	
	@FindBy (css = "td#ygtvt8 > a")
	private WebElement sitesSwsdpFolder;
	
	@FindBy (css = "td#ygtvt11 > a")
	private WebElement sitesDocumentLibraryFolder;
	
	@FindBy (id = "ygtvlabelel16")
	private WebElement sitesMeetingNotesText;


	public void clickOnRepository() {
		element(repositoryButton).waitUntilVisible();
		repositoryButton.click();

	}

	public void openSitesFolder(){
		element(sitesFolder).waitUntilVisible();
		sitesFolder.click();
	}
	
	public void openSwsdpFolder(){
		element(sitesSwsdpFolder).waitUntilVisible();
		sitesSwsdpFolder.click();
	}
	
	public void openSitesDocumentLibraryFolder(){
		element(sitesDocumentLibraryFolder).waitUntilVisible();
		sitesDocumentLibraryFolder.click();
	}
	
	public void clickOnSitesMeetingNotesText(){
		element(sitesMeetingNotesText).waitUntilVisible();
		sitesMeetingNotesText.click();
	}
	
}
