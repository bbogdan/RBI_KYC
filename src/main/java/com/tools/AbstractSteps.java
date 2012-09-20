package com.tools;

import com.pages.AlfrescoHomePage;
import com.pages.AlfrescoLoginPage;
import com.pages.AlfrescoRepositoryPage;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps{

	private static final long serialVersionUID = -2917865444900602964L;

	public AbstractSteps(Pages pages) {
		super(pages);
		// TODO Auto-generated constructor stub
	}

	
	public AlfrescoHomePage alfrescoHomePage(){
		return getPages().currentPageAt(AlfrescoHomePage.class);
	}

	public AlfrescoLoginPage alfrescoLoginPage(){
		return getPages().currentPageAt(AlfrescoLoginPage.class);
	}
	
	public AlfrescoRepositoryPage alfrescoRepositorypage(){
		return getPages().currentPageAt(AlfrescoRepositoryPage.class);
	}
}
