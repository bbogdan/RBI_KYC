package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.DashboardSteps;
import com.steps.RepositorySteps;


@RunWith(ThucydidesRunner.class)
public class FistAlfrescoTest {


    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://107.23.74.89:8080/share/")
    public Pages pages;
    
    @Steps
    public DashboardSteps dashboardSteps;
    
    @Steps
   public RepositorySteps repositorySteps;
    
    
    @Test
    public void dashboardNavigation(){
    	
    	dashboardSteps.loginUser("admin", "lNVo41KJECU6vOZp84xE");
    	dashboardSteps.openDashboard();
    	repositorySteps.openRepository();
    	repositorySteps.navigateToMeetingNotes();
    	
    }
	
}
