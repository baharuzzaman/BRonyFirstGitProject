package com.MyntraPageActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.MyntraPageElements.MyntraHomeAndLivingElements;
import com.MyntraUtilities.SetupDriver;



public class MyntraHomeAndLivingAction {

	MyntraHomeAndLivingElements myntraHomeAndLivingElements = null;

	public MyntraHomeAndLivingAction() {
		this.myntraHomeAndLivingElements = new MyntraHomeAndLivingElements();
		PageFactory.initElements(SetupDriver.chromeDriver, this.myntraHomeAndLivingElements);
	}

	public void getMyntraHomePage() {
		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void verifyMyntraHomePage() {
		if (SetupDriver.chromeDriver.getTitle().toLowerCase().contains("myntra")) {
			System.out.println("Successfully Navigated to The Myntra Home Page");
		} else {
			System.out.println("Navigation to the Myntra Home Page site failed!");
			fail();
		}

	}

	public void navigateToHomeAndLivingMenue() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(myntraHomeAndLivingElements.homeAndliving);
		action.perform();

	}

	public void navigateToBedSheets() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(myntraHomeAndLivingElements.bedSheets);
		action.click();
		action.perform();
	}

	public void ClickWomenBtn() throws InterruptedException {
		myntraHomeAndLivingElements.clickWomenBtn.click();
		Thread.sleep(5000);
	}

	public void verifyWomenBedsheetPage() throws InterruptedException {
		if (SetupDriver.chromeDriver.getTitle().toLowerCase().contains("bedsheets")) {
			System.out.println("Successfully Navigated to the Women Bedsheets Page");
			
			Thread.sleep(5000);
		} else {
			System.out.println("Navigated to the Women Bedsheets Page failed!");
			fail();
		}

	}
			
		

	}


