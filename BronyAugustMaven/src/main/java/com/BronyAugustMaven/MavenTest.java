package com.BronyAugustMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {
	public void ups() {
		WebDriver ChromeDriver = new ChromeDriver(); // Upcasting
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver.get("https://wwwapps.ups.com/doapp/signup");
		ChromeDriver.manage().window().maximize();
		ChromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement Cookies = ChromeDriver.findElement(By.className("showConsentpreferences_button"));
		Cookies.click();
		WebElement Confirm = ChromeDriver.findElement(By.id("preferences_prompt_submit"));
		Confirm.click();
		WebElement Name = ChromeDriver.findElement(By.xpath("//*[@id='ups-full_name_input']"));
		Name.sendKeys("Md Baharuzzaman Rony");
		WebElement Email = ChromeDriver.findElement(By.xpath("//*[@id='ups-email_input']"));
		Email.sendKeys("123@hotmail.com");
		WebElement UserID = ChromeDriver.findElement(By.xpath("//*[@id='ups-user_id_input']"));
		UserID.sendKeys("baharuzzaman");
		WebElement Password = ChromeDriver.findElement(By.xpath("//*[@id='ups-user_password_input']"));
		Password.sendKeys("01717020210");
		WebElement PhoneNumber = ChromeDriver.findElement(By.xpath("//*[@id='ups-phone_input']"));
		PhoneNumber.sendKeys("9184678584");
		WebElement CheckBox = ChromeDriver.findElement(By.xpath("//*[@id=\'ups-checkbox_group\']/div/label"));
		CheckBox.click();
		WebElement Signup = ChromeDriver.findElement(By.xpath(
				"//*[@id='main']/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button/span"));
		Signup.click();
	}

}
