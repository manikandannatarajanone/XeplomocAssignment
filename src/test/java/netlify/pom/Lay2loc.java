package netlify.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import netlify.utility.Baseclass;

public class Lay2loc extends Baseclass {

	
	public Lay2loc() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getOption() {
		return option;
	}

	public WebElement getOwc() {
		return owc;
	}

	public WebElement getApplicableoptions() {
		return applicableoptions;
	}

	public WebElement getDatalists() {
		return datalists;
	}

	public WebElement getFavcolor() {
		return favcolor;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSubmit() {
		return submit;
	}


	@FindBy(id="fname")
	private WebElement firstname;
	
	@FindBy(id="lname")
	private WebElement lastname;
	
	@FindBy(id="male")
	private WebElement gender;
	
	@FindBy(id="option")
	private WebElement option;
	
	@FindBy(id="owc")
	private WebElement owc;
	
	@FindBy(name="option2")
	private WebElement applicableoptions;
	
	@FindBy(xpath="//input[@list='datalists']")
	private WebElement datalists;
	
	@FindBy(id="favcolor")
	private WebElement favcolor;
	
	@FindBy(xpath="//input[@type='date']")
	private WebElement date;
	
	@FindBy(xpath="//label[text()='Scroll to see a range value:']")
	private WebElement scroll;
	
	@FindBy(id="myfile")
	private WebElement file;
	
	@FindBy(id="quantity")
	private WebElement quantity;
	
	@FindBy(name="message")
	private WebElement message;
	
	@FindBy(xpath="//button[text()=' Submit']")
	private WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
