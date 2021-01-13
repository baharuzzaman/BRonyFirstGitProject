package com.MyntraPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraHomeAndLivingElements {
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a")
	public WebElement homeAndliving;
	
	@FindBy(xpath="//a[@data-reactid=\"481\"]")
	public WebElement bedSheets;

	@FindBy(xpath="//label[contains(text(),'Women')]")
	public WebElement clickWomenBtn;
	

}
