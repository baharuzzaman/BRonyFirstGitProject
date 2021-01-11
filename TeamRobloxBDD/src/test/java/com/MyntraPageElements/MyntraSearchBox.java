package com.MyntraPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraSearchBox {
	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	public WebElement searchBar;

	
}
