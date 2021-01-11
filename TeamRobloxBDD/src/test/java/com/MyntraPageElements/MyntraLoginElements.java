package com.MyntraPageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyntraLoginElements {
	
	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
	public WebElement profile;

	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	public WebElement LoginorSignup;

	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	public WebElement phonenumber;

	@FindBy(xpath = "//div[@class='submitBottomOption']")
	public WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"reactPageContent\"]/div/div[3]/span")
	public WebElement passwordBtn;
	
	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='btn primary  lg block submitButton']")
	public WebElement LoginBtn;
	

}
