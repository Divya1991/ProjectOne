package StepDefinition1;

import ChilderndPage.LoginPage;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import commonbase.AppDriver1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage1Steps extends LoginPage {

	public LoginPage1Steps() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Given("^User want to open \"(.*)\" browser$")
	public void want_to_open_browser(String browser)throws Throwable{
		openBrowser(browser);
	}
	
	@And("^User want to launch the \"(.*)\"$")
	public void want_to_launch(String URL) throws Throwable{
		navigateURL(URL);
	}
	
	@When("^User want to click to \"(.*)\"$")
	public void want_to_click(String xpath) throws Throwable{
		clickbutton(xpath);
	}
	

	@Then("^User want to enter \"(.*)\" as \"(.*)\"$")
    public void want_to_enter_id(String xpath,String entervalue) throws Throwable{
		enterText(xpath, entervalue);
	}


	@Given ("^Want to login as \"(.*)\" with \"(.*)\" on \"(.*)\"$")
	public void want_login_with_credetials  (String enterValue, String pwdValue, String browser) {
		userLogin(enterValue, pwdValue, browser);
	}
	
}
