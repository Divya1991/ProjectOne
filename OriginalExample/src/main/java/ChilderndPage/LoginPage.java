package ChilderndPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonbase.AppDriver1;

public class LoginPage extends AppDriver1{

	public LoginPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath = "//button[@aria-label='Login. Opens a dialog.']") public WebElement Login_Btn;
	@FindBy (xpath = "//input[@name='emailAddress']") public WebElement Email_ID;
	@FindBy (xpath = "//input[@name='password']") public WebElement Password;
	@FindBy (xpath = "//button[@class='button-primary login-button']") public WebElement Submit_btn;
	@FindBy (xpath = "//button[@aria-label='Close this modal']") public WebElement Close_popup;
	
	
	
	public void userLogin (String emailValue, String pwdValue, String browser) {
		try {
			openBrowser(browser);
			navigateURL("URL");
			Thread.sleep(1000);
			Close_popup.click();
			Login_Btn.click();
			Email_ID.sendKeys(emailValue);
			Password.sendKeys(pwdValue);
			Submit_btn.click();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
