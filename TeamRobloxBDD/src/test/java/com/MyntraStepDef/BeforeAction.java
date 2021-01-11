package com.MyntraStepDef;

import com.MyntraUtilities.SetupDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAction {
	@Before
	public void beforeScenario(Scenario scen) {

		System.out.println("..Chrome Driver initialization..");
		SetupDriver.setupChromeDriver();
		System.out.println("..Chrome Driver initialized..");
		System.out.println("scen.getName()");

	}

}
