package com.steps;

import com.tools.AbstractSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

public class DashboardSteps extends AbstractSteps{

	private static final long serialVersionUID = -8007600990982233944L;

	public DashboardSteps(Pages pages) {
		super(pages);
		// TODO Auto-generated constructor stub
	}
	
	@Step
	public void openDashboard(){
		alfrescoHomePage().clickOnDashboard();
	}

	@StepGroup
	public void loginUser(String userName, String userPass){
		alfrescoLoginPage().performLogin(userName, userPass);
	}
}
