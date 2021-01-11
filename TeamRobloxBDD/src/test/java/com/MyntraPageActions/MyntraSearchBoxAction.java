package com.MyntraPageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.MyntraPageElements.MyntraSearchBox;
import com.MyntraUtilities.SetupDriver;

public class MyntraSearchBoxAction {
	MyntraSearchBox searchBox;

	public MyntraSearchBoxAction() {
		this.searchBox = new MyntraSearchBox();
		PageFactory.initElements(SetupDriver.chromeDriver, searchBox);

	}

	public void getMyntraHomepage() {
		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDriver.chromeDriver.getTitle());

		if (SetupDriver.chromeDriver.getTitle().contains("Myntra")) {
			bool = true;
		}

		return bool;
	}

	public void SearchTshirt(String item) {
		
		searchBox.searchBar.sendKeys(item);
		
	}
	
	public void PressEnterBtn() throws InterruptedException {
		searchBox.searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public boolean verifySearchPage() {
		boolean bool = false;
		System.out.println(SetupDriver.chromeDriver.getCurrentUrl());
		if (SetupDriver.chromeDriver.getCurrentUrl() == "https://www.myntra.com/t-shirt") {
			bool = true;
		}

		return bool;
	}


}
