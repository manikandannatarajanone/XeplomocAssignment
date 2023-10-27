package netlify.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import netlify.utility.Baseclass;

public class Lay1loc extends Baseclass {
	
	public Lay1loc() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@onclick='alertfunction()']")
	private WebElement Alert;
	
	@FindBy(xpath="//button[@ondblclick='myFunction()']")
	private WebElement doubleclick;
	
	
	@FindBy(id="drag1")
	private WebElement drag;
	
	@FindBy(id="div1")
	private WebElement drop;
	
	@FindBy(id="uname")
	private WebElement username;
	
	@FindBy(id="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[text()='here']")
	private WebElement clickback;
	
	public WebElement getClickback() {
		return clickback;
	}


	public WebElement getAlert() {
		return Alert;
	}


	public WebElement getDoubleclick() {
		return doubleclick;
	}


	public WebElement getDrag() {
		return drag;
	}


	public WebElement getDrop() {
		return drop;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	
	
	
	
	
	
	
	
	
	
	
	

}
