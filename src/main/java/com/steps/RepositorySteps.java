package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import com.tools.AbstractSteps;

public class RepositorySteps extends AbstractSteps {
	
	private static final long serialVersionUID = -3056722435854581065L;

	public RepositorySteps(Pages pages) {
		super(pages);
		// TODO Auto-generated constructor stub
	}
	
	@Step
	public void openRepository(){
		alfrescoRepositorypage().clickOnRepository();
	}
	
	@Step
	public void openSitesFolder(){
		alfrescoRepositorypage().openSitesFolder();
	}
	
	@Step
	public void openSwsdpFolder(){
		alfrescoRepositorypage().openSwsdpFolder();
	}
	
	@Step
	public void openSitesDocumentLibraryFolder(){
		alfrescoRepositorypage().openSitesDocumentLibraryFolder();
	}
	
	@Step
	public void clickOnSitesMeetingNotesText(){
		alfrescoRepositorypage().clickOnSitesMeetingNotesText();
	}
	
	
	@StepGroup
	public void navigateToMeetingNotes(){
		openSitesFolder();
		openSwsdpFolder();
		openSitesDocumentLibraryFolder();
		clickOnSitesMeetingNotesText();
	}

}
