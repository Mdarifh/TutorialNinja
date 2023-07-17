package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Base.driver,this);
	}

	@FindBy(id="input-email")
	public static WebElement emailfield;
	
	@FindBy(id="input-password")
	public static WebElement passwordfield;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgottenPassword;
	
	public static void doLogin(String email,String password) {
		
		Elements.TypeText(LoginPage.emailfield,email);
	    Elements.TypeText(LoginPage.passwordfield, password);
	    
	    Elements.click(LoginPage.loginButton);
	    
	}
	
	public static void doLogin() {
		
		Elements.TypeText(emailfield,Base.reader.getusername());
		Elements.TypeText(passwordfield,Base.reader.getpassword());
		Elements.click(loginButton);
	}
}
