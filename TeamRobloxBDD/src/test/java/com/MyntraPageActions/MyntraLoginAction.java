package com.MyntraPageActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.MyntraPageElements.MyntraLoginElements;
import com.MyntraUtilities.SetupDriver;

public class MyntraLoginAction {

	MyntraLoginElements myntraLoginElements = null;

	public MyntraLoginAction() {
		this.myntraLoginElements = new MyntraLoginElements();
		PageFactory.initElements(SetupDriver.chromeDriver, this.myntraLoginElements);
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

	/*
	 * public void navigateToMenMenu() throws InterruptedException { Actions action
	 * = new Actions(SetupDriver.chromeDriver);
	 * action.moveToElement(myntraLoginElements.profile); action.perform();
	 * Thread.sleep(4000);
	 * 
	 * }
	 */

	public void navigateToProfileMenu() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(myntraLoginElements.profile);
		action.perform();
		

	}

	public void navigateToLoginorSignup() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(myntraLoginElements.LoginorSignup);
		action.click();
		action.perform();
	}

	/*
	 * public void LoginorSignup() { myntraLoginElements.LoginorSignup.click(); }
	 */

	public void inputPhoneNumber(String phonenumber) {
		myntraLoginElements.phonenumber.sendKeys(phonenumber);
	}

	public void continueBtn() {
		myntraLoginElements.continueBtn.click();
	}

	public void clickPasswordBtn() {
		myntraLoginElements.passwordBtn.click();
	}

	public void inputPassword(String password) {
		myntraLoginElements.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		myntraLoginElements.LoginBtn.click();
	}

	public void verifyLoginPage() {
		if (SetupDriver.chromeDriver.getTitle().toLowerCase().contains("myntra")) {
			System.out.println("Successfully Navigated to the Myntra Home Page");
		} else {
			System.out.println("Navigation to the Myntra Home Page failed!");
			fail();
		}

	}

}
